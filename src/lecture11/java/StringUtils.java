package lecture11.java;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
