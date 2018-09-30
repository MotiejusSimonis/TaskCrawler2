package servises.impl;

import models.DTO.CrawlDTO;
import models.businessLogic.CollectionModel;
import models.constants.DefaultPostParameters;
import models.constants.ConnectionURL;
import models.constants.RegEx;
import models.constants.Settings;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import servises.ICrawlService;
import servises.helpers.SSLCertificatesSetter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Normally this class job would be to get source code from a web server,
 * but in this case it returns from file.
 * @CollectionModel would bring all the information that needs to be collected.
 */
public class CrawlService implements ICrawlService {

    public CrawlDTO getSourceCode(CollectionModel model) {
        try {
            String fullPath = getClass().getClassLoader().getResource(Settings.RELATIVE_FILE_PATH).getPath().substring(1);
            String sourceCode = new String(Files.readAllBytes(Paths.get(fullPath)), StandardCharsets.UTF_8);
            return new CrawlDTO("", true, removeAllUnnecessaryEmptySpaces(sourceCode));
        } catch (IOException e) {
            e.printStackTrace();
            return new CrawlDTO(e.getMessage(), false, null);
        }
    }

    public String removeAllUnnecessaryEmptySpaces(String str) {
        return str.replaceAll(RegEx.EMPTY_LINES, "").replaceAll(RegEx.ANY_AMOUNT_OF_SPACES, " ");
    }


    private List<String> getCookiesWithJavaEE() throws Exception {
        SSLCertificatesSetter.setTrustAllCertsForJavaEE();
        URLConnection connection = new java.net.URL(ConnectionURL.CLASSIC_FLYSAS).openConnection();
        return connection.getHeaderFields().get("Set-Cookie");
    }


    private void post() throws Exception {
        List<String> cookies = getCookiesWithJavaEE();
        Map<String, String> params = DefaultPostParameters.getParams();
        URL url = new URL("https://classic.flysas.com/en/");

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Host", "classic.flysas.com");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Cache-Control", "max-age=0");
        conn.setRequestProperty("Origin", "https://classic.flysas.com");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundary6seuzwo2FBQ5iBaD");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
        conn.setRequestProperty("Referer", "http://classic.flysas.com/");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.9");
        conn.setRequestProperty("Cookie", cookies.get(0));
        conn.setRequestProperty("Cookie", cookies.get(1));
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.setRequestProperty("Content-Length", getParamsLength(params));
        conn.setDoOutput(true);
        StringBuilder sb = new StringBuilder();
        for (String key : params.keySet()) {
            sb.append("------WebKitFormBoundary6seuzwo2FBQ5iBaD")
                    .append("\n")
                    .append("Content-Disposition: form-data; name=\"")
                    .append(key)
                    .append("\"").append("\n")
                    .append(params.get(key));
        }
        conn.getOutputStream().write(sb.toString().getBytes("UTF-8"));

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

        for (int c; (c = in.read()) >= 0; )
            System.out.print((char) c);
    }


    private String post2(List<String> cookies) throws Exception {
        SSLCertificatesSetter.setTrustAllCertsForJavaEE();

        Map<String, String> params = DefaultPostParameters.getParams();

        Connection connection = Jsoup.connect(ConnectionURL.CLASSIC_FLYSAS_POST_2)
                .header("Host", "book.flysas.com")
                .header("Connection", "keep-alive")
                .header("Cache-Control", "max-age=0")
                .header("Origin", "https://classic.flysas.com")
                .header("Upgrade-Insecure-Requests", "1")
                .header("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryxejAh9v9NsRw1jtE")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.48 Safari/537.36")
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                .header("Referer", "http://classic.flysas.com/")
                .header("Accept-Language", "en-US,en;q=0.9")
                .header("Cookie", cookies.get(0))
                .header("Cookie", cookies.get(1))
                .header("Accept-Encoding", "gzip, deflate")
                .header("Content-Length", String.valueOf(getParamsLength(params)))
                .method(Connection.Method.POST);

        for (String key : params.keySet()) {
            connection.data(key, params.get(key));
            System.out.println("key : " + key);
            System.out.println("value : " + params.get(key));
        }

        return connection.execute().parse().toString();
    }


    private String post3() throws Exception{

        HttpPost request = new HttpPost(ConnectionURL.CLASSIC_FLYSAS_POST_2);
        request.setEntity(new ByteArrayEntity(DefaultPostParameters.getByteArrayForOutputStream()));

        HttpResponse response = SSLCertificatesSetter.setTrustAllCertsForHTTPClient().execute(request);
        Reader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));

        StringBuilder postData = new StringBuilder();
        for (int c; (c = in.read()) >= 0; )
            postData.append(c);
        return postData.toString();
    }


    private String getParamsLength(Map<String, String> params) throws Exception {
        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, String> param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");
        return String.valueOf(postDataBytes.length);
    }
}


