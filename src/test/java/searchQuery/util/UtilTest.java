package searchQuery.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    @Test
    void normalizeData() {
        String actual = Util.normalizeData("<span>normalize data</span>");
        String expected = "normalize data";
        Assertions.assertEquals(expected, actual);
    }
}