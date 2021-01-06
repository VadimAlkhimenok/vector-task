package main.java;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthOfVector() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }
}
