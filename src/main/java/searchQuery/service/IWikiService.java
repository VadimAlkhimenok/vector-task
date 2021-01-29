package searchQuery.service;

import searchQuery.models.Result;
import searchQuery.models.Wiki;

import java.util.List;

public interface IWikiService {
    Wiki getWiki();

    void putWikiDataInStorage(String url);
}
