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

    @Test
    public void getScalar() {
        double actual = vector.getScalar(testVector);
        double expected = 18.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void crossProduct() {
        Vector actual = vector.crossProduct(testVector);
        Assertions.assertEquals(actual.getX(), Double.valueOf(0));
        Assertions.assertEquals(actual.getY(), Double.valueOf(0));
        Assertions.assertEquals(actual.getZ(), Double.valueOf(0));
    }

    @Test
    public void cos() {
        double actual = vector.cos(testVector);
        double expected = 27.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sum() {
        Vector actual = vector.sum(testVector);
        System.out.println(actual);
        Assertions.assertEquals(actual.getX(), Double.valueOf(5));
        Assertions.assertEquals(actual.getY(), Double.valueOf(5));
        Assertions.assertEquals(actual.getZ(), Double.valueOf(5));
    }

    @Test
    public void dif() {
        Vector actual = vector.dif(testVector);
        Assertions.assertEquals(actual.getX(), Double.valueOf(-1));
        Assertions.assertEquals(actual.getY(), Double.valueOf(-1));
        Assertions.assertEquals(actual.getZ(), Double.valueOf(-1));    }
}