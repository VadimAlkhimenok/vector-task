package searchQuery;

import searchQuery.output.ConsoleOutput;
import searchQuery.output.FileOutput;
import searchQuery.output.OutputResult;
import searchQuery.wikiService.WikiService;
import searchQuery.wikiService.WikiServiceImpl;

import static searchQuery.TypeOutput.*;

public class Factory {
    private static Factory factory;
    WikiService wikiService = new WikiServiceImpl();

    private Factory() {}

    public static Factory getFactory() {
        if (factory == null) {
            factory = new Factory();
        }
        return factory;
    }

    public OutputResult create(TypeOutput type) {
        if (CONSOLE.equals(type)) {
            return new ConsoleOutput(wikiService);
        } else {
            return new FileOutput(wikiService);
        }
    }
}