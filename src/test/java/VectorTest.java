import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class VectorTest {
    Vector vector = new Vector(2, 2, 2);
    Vector testVector = new Vector(3, 3, 3);

    @Test
    public void lengthOfVector() {
        double actual = vector.lengthOfVector();
        double expected = 3.4641016151377544;
        Assertions.assertEquals(expected, actual);
    }

}