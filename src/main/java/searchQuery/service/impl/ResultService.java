package searchQuery.service.impl;

import searchQuery.models.Result;
import searchQuery.models.Wiki;
import searchQuery.service.IResultService;
import searchQuery.util.Util;

import java.util.List;

public class ResultService implements IResultService {
    @Override
    public List<Result> getResultFromWiki(Wiki wiki) {
        return wiki.getQuery().getResultData();
    }

    @Override
    public List<Result> getParseWikiData(List<Result> results) {
        for (Result object : results) {
            object.setSnippet(Util.normalizeData(object.getSnippet()));
        }
        return results;
    }
}
