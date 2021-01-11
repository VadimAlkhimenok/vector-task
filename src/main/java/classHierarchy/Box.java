package classHierarchy;

import java.util.ArrayList;

public class Box {
    private double size;
    private ArrayList<Shape> arrayShapes = new ArrayList<>();

    public Box(double size) {
        this.size = size;
    }

    public double getVolume() {
        double result = 0.0;
        for (Shape item : arrayShapes) {
            result += item.getVolume();
        }
        return result;
    }

    public ArrayList<Shape> getAllShapesInBox() {
        return arrayShapes;
    }

    public boolean add(Shape shape) {
        if (size >= getVolume()) {
            arrayShapes.add(shape);

            System.out.println("Success! Shape was added.");
            return true;
        } else {
            System.out.println("Error! Shape wasn't added.");
            return false;
        }
    }
}