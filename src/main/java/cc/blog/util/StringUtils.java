package cc.blog.util;

public class StringUtils {
    public static boolean isEmpty(String value) {

        return value != null && value.trim().length() > 0;
    }
}
