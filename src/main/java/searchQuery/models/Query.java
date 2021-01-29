package searchQuery.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Query {

    @JsonProperty("search")
    private List<Result> results;

    @JsonProperty("searchinfo")
    private SearchInfo searchInfoModel;

    public Query(SearchInfo searchInfoModel, List<Result> results) {
        this.searchInfoModel = searchInfoModel;
        this.results = results;
    }

    public Query() {}

    public SearchInfo getSearchInfo() {
        return searchInfoModel;
    }

    public void setSearchInfo(SearchInfo searchInfoModel) {
        this.searchInfoModel = searchInfoModel;
    }

    public List<Result> getResultData() {
        return results;
    }

    public void setResultData(ArrayList<Result> results) {
        this.results = results;
    }
}