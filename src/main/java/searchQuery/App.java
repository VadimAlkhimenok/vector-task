package searchQuery;

import searchQuery.factories.OutputServiceFactory;
import searchQuery.models.*;
import searchQuery.service.impl.*;
import searchQuery.storage.Storage;

import java.io.IOException;
import java.util.List;

import static searchQuery.common.OutputTypes.*;

public class App {
    public static void main(String[] args) throws IOException {
        ConsoleInputService consoleInputService = new ConsoleInputService();
        String search = consoleInputService.readData();

        WikiServiceImpl wikiService = new WikiServiceImpl();
        Wiki wiki = wikiService.getWikiByWord(search);

        Storage outputResult = OutputServiceFactory.getFactory().getOutputService(FILE);
        outputResult.putWikiDataInStorage(wiki);
        List<Result> parseResult = outputResult.getParseWikiData(outputResult.getResultFromWiki());
        outputResult.showResult(parseResult);
    }
}