package searchQuery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchData {
    private String title;
    private String snippet;

    @JsonProperty("pageid")
    private int pageId;

    public SearchData(String title, int pageid, String snippet) {
        this.title = title;
        this.pageId = pageid;
        this.snippet = snippet;
    }

    public SearchData() {}

    public String getTitle() {
        return title;
    }

    public int getPageId() {
        return pageId;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return '{' + "title = " + title + ", " + "pageid" + " = " + pageId + ", " + "snippet" + " = " + snippet  + '}';
    }
}
