package servises.helpers;

import java.lang.reflect.Field;

public final class QueryBuilder {

    private QueryBuilder() {}

    public static String createInsertQuery(Object object) {
        try {
            Class<?> zclass = object.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO [CrawlerTask1].[dbo].[").append(getClassNameWithoutModel(zclass)).append("] VALUES (");
            Field[] fields = zclass.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                // In case given Objects field is not initialized we set it to 'null'
                if (fields[i].get(object) == null) {
                    sb.append("null");
                } else {
                    // All other cases get their field value assigned
                    sb.append(quoteIdentifier(fields[i].get(object).toString()));
                }
                // If this is not the last field we append ',' otherwise we add ')' to close the VALUES clause
                if (i != fields.length - 1) {
                    sb.append(",");
                } else {
                    sb.append(")");
                }
            }
            return sb.toString();
        } catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }


    private static String getClassNameWithoutModel(Class c) {
        return c.getSimpleName().replace("Model", "");
    }


    private static String quoteIdentifier(String value) {
        return "'" + value + "'";
    }
}
