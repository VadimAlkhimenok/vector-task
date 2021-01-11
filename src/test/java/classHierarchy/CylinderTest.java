package classHierarchy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder cylinder = new Cylinder(10, 10);

    @Test
    void getVolume() {
        double actual = cylinder.getVolume();
        double expected = 3141.5926535897934;
        assertEquals(expected, actual);
    }
}