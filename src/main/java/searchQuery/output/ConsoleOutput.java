package searchQuery.output;

import searchQuery.models.ResultData;
import searchQuery.wikiService.WikiService;

import java.util.List;

public class ConsoleOutput implements OutputResult {
    private final WikiService wikiService;

    public ConsoleOutput(WikiService wikiService) {
        this.wikiService = wikiService;
    }

    @Override
    public void showResult(List<ResultData> result) {
        for (ResultData object : result) {
            System.out.println(object);
        }
    }

    @Override
    public List<ResultData> convertTextInObj(List<ResultData> resultData) {
        return wikiService.getParseWikiData(resultData);
    }
}
