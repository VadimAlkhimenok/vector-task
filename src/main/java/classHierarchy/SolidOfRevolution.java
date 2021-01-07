package classHierarchy;

public class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double radius, double volume) {
        super(volume);
        this.radius = radius;
    }

    public SolidOfRevolution () {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
