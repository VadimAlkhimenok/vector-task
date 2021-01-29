package searchQuery.service;

import searchQuery.models.Result;

import java.io.IOException;
import java.util.List;

public interface OutputService {
    void showResult(List<Result> results) throws IOException;
}
