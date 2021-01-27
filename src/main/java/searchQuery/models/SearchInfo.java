package searchQuery.models;

import java.util.Map;

public class SearchInfo {
    private Map<String, Object> searchInfo;

    public SearchInfo(Map<String, Object> searchInfo) {
        this.searchInfo = searchInfo;
    }

    public SearchInfo() {}

    public Map<String, Object> getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(Map<String, Object> searchInfo) {
        this.searchInfo = searchInfo;
    }
}
