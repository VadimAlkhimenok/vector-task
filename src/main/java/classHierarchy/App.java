package classHierarchy;

import static classHierarchy.TypeOfShapes.*;

public class App {
    public static void main(String[] args) {
        // Factory
        Factory factory = new Factory();
        Shape ball = factory.create(BALL, 4.5);
        Shape cylinder = factory.create(CYLINDER, 10, 4.5);
        Shape pyramid = factory.create(PYRAMID, 20, 35);
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
        Box box = new Box(1000);

        System.out.println("-Box-");
        System.out.println("Current volume of box: " + box.getMaxVolumeOfBox());
        box.add(ball);
        System.out.println("Current volume of box: " + box.getMaxVolumeOfBox());
        box.add(cylinder);
        System.out.println("Current volume of box: " + box.getMaxVolumeOfBox());
        box.add(pyramid);
        System.out.println("Current volume of box: " + box.getMaxVolumeOfBox());
    }
}