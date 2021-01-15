package classHierarchy;

import java.util.Objects;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(this.radius, 3) * 4 / 3;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if ((o == null) || (getClass() != o.getClass())) return false;

        Ball ball = (Ball) o;
        return radius == ball.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}