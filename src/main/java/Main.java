
import servises.impl.CrawlService;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CrawlService crawlService = new CrawlService();
        try {
            crawlService.post();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void print(Object obj) {

        if (obj instanceof List) {
            for (Object item: (List) obj) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println(obj.toString());
        }
    }
}
