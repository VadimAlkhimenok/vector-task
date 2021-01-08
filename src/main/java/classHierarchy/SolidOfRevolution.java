package classHierarchy;

abstract class SolidOfRevolution implements Shape {
    double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}