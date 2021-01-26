package searchQuery;

public class Util {
    public String normalizeData(String text) {
        return text.replaceAll("<.*?>","");
    }
}
