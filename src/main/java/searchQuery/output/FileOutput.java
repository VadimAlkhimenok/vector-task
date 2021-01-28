package searchQuery.output;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import searchQuery.models.ResultData;
import searchQuery.wikiService.WikiService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileOutput implements OutputResult {
    private WikiService wikiService;

    public FileOutput(WikiService wikiService) {
        this.wikiService = wikiService;
    }

    @Override
    public void showResult(List<ResultData> result) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jo = gson.toJson(result);

        FileWriter fw = new FileWriter( "src/main/java/searchQuery/wikiData.json" );
        fw.write(jo);
        fw.close();
    }

    @Override
    public List<ResultData> convertTextInObj(List<ResultData> resultData) {
        return wikiService.getParseWikiData(resultData);
    }
}
