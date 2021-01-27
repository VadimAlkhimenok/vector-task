package searchQuery.models;

import java.util.Map;

public class ContinueModel {
    private Map<String, Object> continueModel;

    public ContinueModel(Map<String, Object> continueModel) {
        this.continueModel = continueModel;
    }

    public ContinueModel() {}

    public Map<String, Object> getContinueModel() {
        return continueModel;
    }

    public void setContinueModel(Map<String, Object> continueModel) {
        this.continueModel = continueModel;
    }
}
