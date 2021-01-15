package classHierarchy;

import java.util.Objects;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(this.radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if ((o == null) || (getClass() != o.getClass())) return false;

        Cylinder cylinder = (Cylinder) o;
        return (radius == cylinder.radius) && (height == cylinder.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }
}