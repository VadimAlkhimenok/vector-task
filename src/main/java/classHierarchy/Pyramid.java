package classHierarchy;

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
}