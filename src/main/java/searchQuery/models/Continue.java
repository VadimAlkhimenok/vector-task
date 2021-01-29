package searchQuery.models;

import java.util.Map;

public class Continue {
    private Map<String, Object> continueModel;

    public Continue(Map<String, Object> continueModel) {
        this.continueModel = continueModel;
    }

    public Continue() {}

    public Map<String, Object> getContinueModel() {
        return continueModel;
    }

    public void setContinueModel(Map<String, Object> continueModel) {
        this.continueModel = continueModel;
    }
}
