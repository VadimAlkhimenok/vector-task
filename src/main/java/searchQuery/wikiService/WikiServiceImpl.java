package searchQuery.wikiService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.client.RestTemplate;
import searchQuery.util.Util;
import searchQuery.models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WikiServiceImpl implements WikiService {
    @Override
    public String getUrl(String word) {
        final String url = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";
        return url + word;
    }

    @Override
    public WikiData getWikiData(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, WikiData.class);
    }

    @Override
    public List<ResultData> getParseWikiData(List<ResultData> resultData) {
        for (ResultData object : resultData) {
            object.setSnippet(Util.normalizeData(object.getSnippet()));
        }
        return resultData;
    }

    @Override
    public void showResultInConsole(List<ResultData> result) {
        for (ResultData object : result) {
            System.out.println(object);
        }
    }

    @Override
    public void writeResultInFile(List<ResultData> result) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jo = gson.toJson(result);

        FileWriter fw = new FileWriter( "src/main/java/searchQuery/wikiData.json" );
        fw.write(jo);
        fw.close();
    }
}
