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

    public double getScalar(Vector newVector) {
        return (newVector.x * x) + (newVector.y * y) + (newVector.z * z);
    }

    public Vector crossProduct(Vector newVector) {
        return new Vector(
                y * newVector.z - z * newVector.y,
                z * newVector.x - x * newVector.z,
                x * newVector.y - y * newVector.x
        );
    }

}
