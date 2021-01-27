package searchQuery.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class QueryModel {
    @JsonProperty("search")
    private List<ResultData> resultData;

    @JsonProperty("searchinfo")
    private SearchInfoModel searchInfoModel;

    public QueryModel(SearchInfoModel searchInfoModel, List<ResultData> resultData) {
        this.searchInfoModel = searchInfoModel;
        this.resultData = resultData;
    }

    public QueryModel() {}

    public SearchInfoModel getSearchInfo() {
        return searchInfoModel;
    }

    public void setSearchInfo(SearchInfoModel searchInfoModel) {
        this.searchInfoModel = searchInfoModel;
    }

    public List<ResultData> getResultData() {
        return resultData;
    }

    public void setResultData(ArrayList<ResultData> resultData) {
        this.resultData = resultData;
    }
}
