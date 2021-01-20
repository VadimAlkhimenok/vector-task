package searchQuery;

public class QueryString {
    public static String getStringForSearch(String word) {
        return "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=" + word;
    }
}
