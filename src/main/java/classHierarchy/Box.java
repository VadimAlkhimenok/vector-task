package classHierarchy;

import java.util.ArrayList;

public class Box implements Shape {
    private double maxVolumeOfBox;
    private double volume;
    private ArrayList<Shape> arrayShapes = new ArrayList<>();

    public Box(double maxVolumeOfBox) {
        this.maxVolumeOfBox = maxVolumeOfBox;
    }

    public double getMaxVolumeOfBox() {
        return maxVolumeOfBox;
    }

    public void getAllShapesInBox() {
        System.out.println(arrayShapes);
    }

    public boolean add(Shape shape) {
        if (maxVolumeOfBox >= shape.getVolume()) {
            arrayShapes.add(shape);
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