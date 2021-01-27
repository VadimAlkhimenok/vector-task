package searchQuery.models;

import java.util.Map;

public class SearchInfoModel {
    private Map<String, Object> searchInfo;

    public SearchInfoModel(Map<String, Object> searchInfo) {
        this.searchInfo = searchInfo;
    }

    public SearchInfoModel() {}

    public Map<String, Object> getSearchInfoModel() {
        return searchInfo;
    }

    public void setSearchInfoModel(Map<String, Object> searchInfo) {
        this.searchInfo = searchInfo;
    }
}
