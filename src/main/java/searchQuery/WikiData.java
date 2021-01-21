package searchQuery;

public class WikiData {
    private String title;
    private int pageid;
    private String snippet;

    public WikiData(String title, int pageid, String snippet) {
        this.title = title;
        this.pageid = pageid;
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return '{' + "title=" + title + ", pageid=" + pageid + ", snippet=" + snippet + '}';
    }
}
