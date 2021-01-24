package searchQuery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {

    @Test
    void getJsonData() {
        String url = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=Java";
        int actual = new Request().getJsonData(url).getQuery().getSearch().get(0).getPageId();
        int expected = 2506;
        Assertions.assertEquals(expected, actual);
    }
}