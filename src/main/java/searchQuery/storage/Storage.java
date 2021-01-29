package searchQuery.storage;

import searchQuery.models.Result;
import searchQuery.models.Wiki;
import searchQuery.util.Util;

import java.util.List;

public class Storage {
    private Wiki result;

    public Wiki getResult() {
        return result;
    }

    public void setResult(Wiki result) {
        this.result = result;
    }

    public void putWikiDataInStorage(Wiki wiki) {
        this.setResult(wiki);
    }

    public List<Result> getResultFromWiki() {
        return this.getResult().getQuery().getResultData();
    }

    public List<Result> getParseWikiData(List<Result> results) {
        for (Result object : results) {
            object.setSnippet(Util.normalizeData(object.getSnippet()));
        }
        return results;
    }
}
