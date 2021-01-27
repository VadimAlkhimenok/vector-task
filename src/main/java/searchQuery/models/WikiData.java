package searchQuery.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WikiData {
    @JsonProperty("batchcomplete")
    private BathCompleteModel batchComplete;

    @JsonProperty("continue")
    private ContinueModel continues;

    private QueryModel query;

    public WikiData() {}

    public WikiData(BathCompleteModel batchComplete, ContinueModel continues, QueryModel query) {
        this.batchComplete = batchComplete;
        this.continues = continues;
        this.query = query;
    }

    public BathCompleteModel getBatchComplete() {
        return batchComplete;
    }

    public void setBatchComplete(BathCompleteModel batchComplete) {
        this.batchComplete = batchComplete;
    }

    public ContinueModel getContinues() {
        return continues;
    }

    public void setContinues(ContinueModel continues) {
        this.continues = continues;
    }

    public QueryModel getQuery() {
        return query;
    }

    public void setQuery(QueryModel query) {
        this.query = query;
    }
}
