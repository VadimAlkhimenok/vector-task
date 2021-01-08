package classHierarchy;

public class Box implements Shape {
    private double maxVolumeOfBox;
    private double volume;

    public Box(double maxVolumeOfBox) {
        this.maxVolumeOfBox = maxVolumeOfBox;
    }

    public double getMaxVolumeOfBox() {
        return maxVolumeOfBox;
    }

    public boolean add(Shape shape) {
        if (maxVolumeOfBox >= shape.getVolume()) {
            maxVolumeOfBox -= shape.getVolume();
            System.out.println("Success! Shape was added.");
            return true;
        } else {
            System.out.println("Error! Shape wasn't added.");
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}