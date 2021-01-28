package searchQuery.wikiService;

import org.springframework.web.client.RestTemplate;
import searchQuery.Storage;
import searchQuery.util.Util;
import searchQuery.models.*;

import java.util.List;

public class WikiServiceImpl implements WikiService {
    @Override
    public String getUrl(String word) {
        final String url = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
        return url + word;
    }

    @Override
    public void putWikiDataInStorage(String url) {
        RestTemplate restTemplate = new RestTemplate();
        Storage.getInstance().setResult(restTemplate.getForObject(url, WikiData.class));
    }

    @Override
    public List<ResultData> getParseWikiData(List<ResultData> resultData) {
        for (ResultData object : resultData) {
            object.setSnippet(Util.normalizeData(object.getSnippet()));
        }
        return resultData;
    }
}
