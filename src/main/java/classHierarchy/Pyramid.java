package classHierarchy;

import java.util.Objects;

public class Pyramid implements Shape {
    private double s;
    private double height;

    public Pyramid(double s, double height) {
        this.s = s;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return s * height * 1 / 3;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "s=" + s +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if ((o == null) || (getClass() != o.getClass())) return false;

        Pyramid pyramid = (Pyramid) o;
        return (s == pyramid.s) && (height == pyramid.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, height);
    }
}