package classHierarchy;

import java.util.ArrayList;

public class Box implements Shape {
    private double volume;
    private ArrayList<Shape> arrayShapes = new ArrayList<>();

    public Box(double volume) {
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public void getAllShapesInBox() {
        System.out.println(arrayShapes);
    }

    public boolean add(Shape shape) {
        if (volume >= shape.getVolume()) {
            arrayShapes.add(shape);
            volume -= shape.getVolume();

            System.out.println("Success! Shape was added.");
            return true;
        } else {
            System.out.println("Error! Shape wasn't added.");
            return false;
        }
    }
}