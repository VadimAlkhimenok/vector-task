package searchQuery.service;

import searchQuery.models.Result;
import searchQuery.models.Wiki;

import java.util.List;

public interface IResultService {
    List<Result> getResultFromWiki(Wiki wiki);

    List<Result> getParseWikiData(List<Result> results);
}
