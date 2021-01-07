package classHierarchy;

public class App {
    public static void main(String[] args) {
        // Ball
        Ball ball = new Ball(4.5);
        System.out.println("-Ball-");
        System.out.println("Get radius: " + ball.getRadius());
        System.out.println("Get volume: " + ball.getVolume());

        System.out.println();

        // Cylinder
        Cylinder cylinder = new Cylinder(10, 4.5);
        System.out.println("-Cylinder-");
        System.out.println("Get height: " + cylinder.getHeight());
        System.out.println("Get radius: " + cylinder.getRadius());
        System.out.println("Get volume: " + cylinder.getVolume());

        System.out.println();

        // Pyramid
        Pyramid pyramid = new Pyramid(20, 35);
        System.out.println("-Pyramid-");
        System.out.println("Get s: " + pyramid.getS());
        System.out.println("Get height: " + pyramid.getHeight());
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