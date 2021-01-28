package searchQuery;

import searchQuery.models.WikiData;

public class Storage {
    private static Storage instance;
    private Storage() {}

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    private WikiData result;

    public WikiData getResult() {
        return result;
    }

    public void setResult(WikiData result) {
        this.result = result;
    }
}
