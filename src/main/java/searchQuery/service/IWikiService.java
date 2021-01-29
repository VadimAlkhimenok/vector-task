package searchQuery.service;

import searchQuery.models.Wiki;

public interface IWikiService {
    Wiki getWikiByWord(String word);
}
