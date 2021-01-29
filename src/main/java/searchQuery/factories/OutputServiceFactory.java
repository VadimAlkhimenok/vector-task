package searchQuery.factories;

import searchQuery.service.OutputService;
import searchQuery.service.impl.*;

import static searchQuery.extra.OutputTypes.*;

public class OutputServiceFactory {
    private static OutputServiceFactory factory;

    private OutputServiceFactory() {}

    public static OutputServiceFactory getFactory() {
        if (factory == null) {
            factory = new OutputServiceFactory();
        }
        return factory;
    }

    public OutputService getOutputService(String type) {
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