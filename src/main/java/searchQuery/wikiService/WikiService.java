package searchQuery.wikiService;

import searchQuery.models.ResultData;
import java.util.List;

public interface WikiService {
    String getUrl(String word);

    void putWikiDataInStorage(String url);

    List<ResultData> getParseWikiData(List<ResultData> resultData);
}
