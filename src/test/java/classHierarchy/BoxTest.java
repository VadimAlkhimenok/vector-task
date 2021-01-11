package classHierarchy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
class BoxTest {
    @Mock
    private Box boxMock;

    @Test
    void getVolume() {
        when(boxMock.getVolume()).thenReturn(10000.0);

        double actual = boxMock.getVolume();
        double expected = 10000.0;
        assertEquals(expected, actual);
    }

    @Test
    void add() {
        Box boxTest = new Box(1000);
        Ball ballTest = new Ball(10);
        boxTest.add(ballTest);
        assertFalse(boxTest.getAllShapesInBox().size() == 0);
    }
}