package searchQuery;

import searchQuery.models.*;
import searchQuery.wikiService.*;

import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Console console = new Console();
        System.out.print("Input searching word: ");
        String word = console.inputWordForSearch();

        WikiService wikiService = new WikiServiceImpl();
        String url = wikiService.getUrl(word);
        WikiData wikiData = wikiService.getWikiData(url);

        List<ResultData> result = wikiData.getQuery().getResultData();
        List<ResultData> parseResult = wikiService.getParseWikiData(result);

        wikiService.showResultInConsole(parseResult);
        wikiService.writeResultInFile(parseResult);
    }
}