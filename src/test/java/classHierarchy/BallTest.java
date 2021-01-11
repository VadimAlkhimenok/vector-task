package classHierarchy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    Ball ball = new Ball(10);

    @Test
    void getVolume() {
        double actual = ball.getVolume();
        double expected = 4188.790204786391;
        assertEquals(expected, actual);
    }
}