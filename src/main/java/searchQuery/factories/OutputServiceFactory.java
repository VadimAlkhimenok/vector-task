package searchQuery.factories;

import searchQuery.common.OutputTypes;
import searchQuery.service.OutputService;
import searchQuery.service.impl.*;

public class OutputServiceFactory {
    private static OutputServiceFactory factory;

    private OutputServiceFactory() {}

    public static OutputServiceFactory getFactory() {
        if (factory == null) {
            factory = new OutputServiceFactory();
        }
        return factory;
    }

    public OutputService getOutputService(OutputTypes type) {
        switch (type) {
            case CONSOLE:
                return new ConsoleOutputService();
            case FILE:
                return new FileOutputService();
            default:
                return null;
        }
    }
}