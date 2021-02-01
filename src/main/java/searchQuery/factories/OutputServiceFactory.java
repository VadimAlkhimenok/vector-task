package searchQuery.factories;

import searchQuery.common.OutputTypes;
import searchQuery.models.Result;
import searchQuery.service.impl.*;

import java.io.IOException;
import java.util.List;

public class OutputServiceFactory {
    private static OutputServiceFactory factory;

    private OutputServiceFactory() {}

    public static OutputServiceFactory getFactory() {
        if (factory == null) {
            factory = new OutputServiceFactory();
        }
        return factory;
    }

    public void getOutputService(OutputTypes type, List<Result> results) throws IOException {
        switch (type) {
            case CONSOLE:
                new ConsoleOutputResult().showResult(results);
            case FILE:
                new FileOutputResult().showResult(results);
            default:
        }
    }
}