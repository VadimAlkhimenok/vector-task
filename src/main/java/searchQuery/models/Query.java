package searchQuery.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Query {
    @JsonProperty("search")
    private List<ResultData> resultData;

    @JsonProperty("searchinfo")
    private SearchInfo searchInfo;

    public Query(SearchInfo searchInfo, List<ResultData> resultData) {
        this.searchInfo = searchInfo;
        this.resultData = resultData;
    }

    public Query() {}

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public List<ResultData> getResultData() {
        return resultData;
    }

    public void setResultData(ArrayList<ResultData> resultData) {
        this.resultData = resultData;
    }
}
