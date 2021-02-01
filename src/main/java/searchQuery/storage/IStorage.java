package searchQuery.storage;

import searchQuery.models.Result;
import searchQuery.models.Wiki;

import java.io.IOException;
import java.util.List;

public interface IStorage {
    void putWikiDataInStorage(Wiki wiki);
    List<Result> getResultFromWiki();
    List<Result> getParseWikiData(List<Result> results);
    void showResult(List<Result> results) throws IOException;
}
