package classHierarchy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {
    Pyramid pyramid = new Pyramid(10, 10);

    @Test
    void getVolume() {
        double actual = pyramid.getVolume();
        double expected = 33.333333333333336;
        assertEquals(expected, actual);
    }
}