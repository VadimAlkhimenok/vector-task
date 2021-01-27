package searchQuery.wikiService;

import searchQuery.models.ResultData;
import searchQuery.models.WikiData;

import java.io.IOException;
import java.util.List;

public interface WikiService {
    String getUrl(String word);

    WikiData getWikiData(String url);

    List<ResultData> getParseWikiData(List<ResultData> resultData);

    void showResultInConsole(List<ResultData> result);

    void writeResultInFile(List<ResultData> result) throws IOException;
}
