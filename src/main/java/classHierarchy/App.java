package classHierarchy;

import java.util.Arrays;

import static classHierarchy.TypeOfShapes.*;

public class App {
    public static void main(String[] args) {
        // Factory
        Shape ball = Factory.getFactory().create(BALL, 5);
        Shape cylinder = Factory.getFactory().create(CYLINDER, 5, 5);
        Shape pyramid = Factory.getFactory().create(PYRAMID, 5, 5);

        // Ball
        System.out.println("-Ball-");
        System.out.println("Get volume: " + ball.getVolume());

        System.out.println();

        // Cylinder
        System.out.println("-Cylinder-");
        System.out.println("Get volume: " + cylinder.getVolume());

        System.out.println();

        // Pyramid
        System.out.println("-Pyramid-");
        System.out.println("Get volume: " + pyramid.getVolume());

        System.out.println();

        // Box
        Box box = new Box(10000);

        System.out.println("-Box-");

        System.out.println("Current volume of box: " + box.getVolume());
        box.add(ball);
        box.add(ball);
        System.out.println("All shapes in box: " + box.getAllShapesInBox());

        System.out.println();

        System.out.println("Current volume of box: " + box.getVolume());
        box.add(cylinder);
        box.add(cylinder);
        System.out.println("All shapes in box: " + box.getAllShapesInBox());

        System.out.println();

        System.out.println("Current volume of box: " + box.getVolume());
        box.add(pyramid);
        box.add(pyramid);
        System.out.println("All shapes in box: " + box.getAllShapesInBox());

        System.out.println();

        System.out.println("Last current volume of box: " + box.getVolume());

        //
        System.out.println(Arrays.toString(TypeOfShapes.values()));
    }
}