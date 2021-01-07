package classHierarchy;

public class Shape implements ShapeInterface {
    private double volume;

    public Shape (double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
