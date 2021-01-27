package searchQuery.util;

import org.jsoup.Jsoup;

public class Util {
    static public String normalizeData(String text) {
        return Jsoup.parse(text).text();
    }
}