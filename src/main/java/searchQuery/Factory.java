package searchQuery;

import searchQuery.output.ConsoleOutput;
import searchQuery.output.FileOutput;
import searchQuery.output.OutputResult;
import searchQuery.output.TypeOutput;

import static searchQuery.output.TypeOutput.*;

public class Factory {
    private static Factory factory;

    private Factory() {}

    public static Factory getFactory() {
        if (factory == null) {
            factory = new Factory();
        }
        return factory;
    }

    public OutputResult create(TypeOutput type) {
        if (CONSOLE.equals(type)) {
            return new ConsoleOutput();
        } else {
            return new FileOutput();
        }
    }
}