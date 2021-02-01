package searchQuery.service.impl;

import searchQuery.models.Result;
import searchQuery.storage.Storage;

import java.util.List;

public class ConsoleOutputResult extends Storage {
    @Override
    public void showResult(List<Result> results) {
        results.forEach(System.out::println);
    }
}
