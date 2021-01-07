package classHierarchy;

public class Pyramid extends Shape {
    private double s;
    private double height;

    public Pyramid(double s, double height) {
        super(s * height * 1 / 3);
        this.s = s;
        this.height = height;
    }

    public double getS() {
        return s;
    }

    public double getHeight() {
        return height;
    }
}
