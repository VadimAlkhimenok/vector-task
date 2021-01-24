package searchQuery;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Map;

public class Query {
    private ArrayList<SearchData> search;

    @JsonProperty("searchinfo")
    private Map<String, Object> searchInfo;

    public Query(Map<String, Object> searchInfo, ArrayList<SearchData> search) {
        this.searchInfo = searchInfo;
        this.search = search;
    }

    public Query() {}

    public Map<String, Object> getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(Map<String, Object> searchinfo) {
        this.searchInfo = searchinfo;
    }

    public ArrayList<SearchData> getSearch() {
        return search;
    }

    public void setSearch(ArrayList<SearchData> search) {
        this.search = search;
    }
}
