package searchQuery;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Response {
    @JsonProperty("batchcomplete")
    private String batchComplete;

    @JsonProperty("continue")
    private Map<String, Object> continues;

    private Query query;

    public Response () {}

    public Response(String batchComplete, Map<String, Object> continues, Query query) {
        this.batchComplete = batchComplete;
        this.continues = continues;
        this.query = query;
    }

    public String getBatchComplete() {
        return batchComplete;
    }

    public void setBatchComplete(String batchComplete) {
        this.batchComplete = batchComplete;
    }

    public Map<String, Object> getContinues() {
        return continues;
    }

    public void setContinues(Map<String, Object> continues) {
        this.continues = continues;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
