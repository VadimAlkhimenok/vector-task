package collectionTasks;

import classHierarchy.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Shape> collection = new HashMap<>();

        Shape ball = new Ball(5);
        Shape cylinder = new Cylinder(5 ,5);
        Shape pyramid = new Pyramid(5, 5);

        collection.put("1", ball);
        collection.put("2", cylinder);
        collection.put("3", pyramid);
        collection.put("4", ball);
        collection.put("5", ball);

        System.out.println();
        System.out.println(InverseCollection.inverse(collection));
    }
}