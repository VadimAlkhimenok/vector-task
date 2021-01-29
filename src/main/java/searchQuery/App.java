package searchQuery;

import searchQuery.extra.Url;
import searchQuery.factories.OutputServiceFactory;
import searchQuery.models.*;
import searchQuery.service.impl.*;
import searchQuery.storage.Storage;

import java.io.IOException;
import java.util.List;

import static searchQuery.extra.OutputTypes.*;

public class App {
    public static void main(String[] args) throws IOException {
        ConsoleInputService consoleInputService = new ConsoleInputService();
        String search = consoleInputService.readData();

        Storage storage = new Storage();

        WikiServiceImpl wikiService = new WikiServiceImpl(storage);
        wikiService.putWikiDataInStorage(Url.url + search);

        Wiki wiki = wikiService.getWiki();

        ResultService resultService = new ResultService();
        List<Result> results = resultService.getResultFromWiki(wiki);
        List<Result> parseResults = resultService.getParseWikiData(results);

        OutputServiceFactory.getFactory().getOutputService(CONSOLE).showResult(parseResults);
        OutputServiceFactory.getFactory().getOutputService(FILE).showResult(parseResults);
    }
}