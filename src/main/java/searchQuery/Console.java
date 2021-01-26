package searchQuery;

public class Console {
    static final String url = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
    private String word;

    public Console() {}

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getUrl() {
        return url;
    }

    public String getWorkingUrl (String word) {
        return url + word;
    }
}