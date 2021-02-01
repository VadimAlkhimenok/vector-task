package searchQuery.factories;

import searchQuery.common.OutputTypes;
import searchQuery.service.impl.*;
import searchQuery.storage.Storage;

public class OutputServiceFactory {
    private static OutputServiceFactory factory;

    private OutputServiceFactory() {}

    public static OutputServiceFactory getFactory() {
        if (factory == null) {
            factory = new OutputServiceFactory();
        }
        return factory;
    }

    public Storage getOutputService(OutputTypes type) {
        switch (type) {
            case CONSOLE:
                return new ConsoleOutputResult();
            case FILE:
                return new FileOutputResult();
            default:
                return null;
        }
    }
}