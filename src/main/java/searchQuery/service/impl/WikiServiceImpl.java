package searchQuery.service.impl;

import org.springframework.web.client.RestTemplate;
import searchQuery.service.IWikiService;
import searchQuery.models.*;

public class WikiServiceImpl implements IWikiService {
    static final String URL = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";

    @Override
    public Wiki getWikiByWord(String word) {
        return new RestTemplate().getForObject(URL + word, Wiki.class);
    }
}
