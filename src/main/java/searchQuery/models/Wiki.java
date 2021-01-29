package searchQuery.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wiki {

    @JsonProperty("batchcomplete")
    private BathComplete batchComplete;

    @JsonProperty("continue")
    private Continue continues;

    private Query query;

    public Wiki() {}

    public Wiki(BathComplete batchComplete, Continue continues, Query query) {
        this.batchComplete = batchComplete;
        this.continues = continues;
        this.query = query;
    }

    public BathComplete getBatchComplete() {
        return batchComplete;
    }

    public void setBatchComplete(BathComplete batchComplete) {
        this.batchComplete = batchComplete;
    }

    public Continue getContinues() {
        return continues;
    }

    public void setContinues(Continue continues) {
        this.continues = continues;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

}