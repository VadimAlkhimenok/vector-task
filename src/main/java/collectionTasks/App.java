package collectionTasks;

import classHierarchy.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<Integer, Object> collection = new HashMap<>();

        Shape ball = new Ball(5);
        Shape cylinder = new Cylinder(5 ,5);
        Shape pyramid = new Pyramid(5, 5);


        collection.put(1, ball);
        collection.put(2, cylinder);
        collection.put(3, pyramid);
        collection.put(4, ball);
        collection.put(5, cylinder);
        collection.put(6, pyramid);

        System.out.println("Before: " + collection);
        System.out.println();
        System.out.println("After: " + InverseCollection.inverse(collection));
    }
}
