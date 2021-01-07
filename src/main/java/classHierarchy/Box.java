package classHierarchy;

public class Box extends Shape {
    private double maxVolumeOfBox;

    public Box(double maxVolumeOfBox) {
        super(maxVolumeOfBox);
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
}
