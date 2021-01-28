package searchQuery;

import searchQuery.models.*;
import searchQuery.output.OutputResult;
import searchQuery.wikiService.*;

import java.io.IOException;
import java.util.*;

import static searchQuery.TypeOutput.*;

public class App {
    public static void main(String[] args) throws IOException {
        ConsoleInput consoleInput = new ConsoleInput();
        System.out.print("Input word: ");
        String word = consoleInput.inputWordForSearch(); // input word

        WikiService wikiService = new WikiServiceImpl();
        String url = wikiService.getUrl(word); // ready url

        wikiService.putWikiDataInStorage(url); // put data in storage

        WikiData wikiData = Storage.getInstance().getResult(); // get data from storage
        List<ResultData> result = wikiData.getQuery().getResultData(); // get data from field query

        OutputResult console = Factory.getFactory().create(CONSOLE);
        List<ResultData> parseDataConsole = console.convertTextInObj(result); // delete tags for console output
        console.showResult(console.convertTextInObj(parseDataConsole)); // show data in console

        OutputResult file = Factory.getFactory().create(FILE);
        List<ResultData> parseDataFile = file.convertTextInObj(result); // delete tags for file output
        file.showResult(file.convertTextInObj(parseDataFile)); // show data in file
    }
}