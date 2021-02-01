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

        Storage storage = new Storage();
        storage.putWikiDataInStorage(wiki);

        List<Result> results = storage.getResultFromWiki();
        List<Result> parseResults = storage.getParseWikiData(results);

        OutputServiceFactory.getFactory().getOutputService(CONSOLE, parseResults);
        OutputServiceFactory.getFactory().getOutputService(FILE, parseResults);
    }
}