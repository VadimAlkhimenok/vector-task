package searchQuery.service.impl;

import searchQuery.models.Result;
import searchQuery.service.OutputService;

import java.util.List;

public class ConsoleOutputService implements OutputService {
    @Override
    public void showResult(List<Result> results) {
        results.forEach(System.out::println);
    }
}
