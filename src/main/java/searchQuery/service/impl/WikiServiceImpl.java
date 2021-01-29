package searchQuery.service.impl;

import org.springframework.web.client.RestTemplate;
import searchQuery.storage.Storage;
import searchQuery.service.IWikiService;
import searchQuery.models.*;

public class WikiServiceImpl implements IWikiService {
    private final Storage storage;

    public WikiServiceImpl(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Wiki getWiki() {
        return storage.getResult();
    }

    @Override
    public void putWikiDataInStorage(String url) {
        storage.setResult(new RestTemplate().getForObject(url, Wiki.class));
    }
}
