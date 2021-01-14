package collectionTasks;

import classHierarchy.*;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) {
        // inverse
        Map<String, Shape> collection = new HashMap<>();

        Shape ball = new Ball(5);
        Shape cylinder = new Cylinder(5 ,5);
        Shape pyramid = new Pyramid(5, 5);

        collection.put("1", ball);
        collection.put("2", cylinder);
        collection.put("3", pyramid);
        collection.put("4", ball);
        collection.put("5", ball);

        System.out.println("Inverse: " + CollectionTasks.inverse(collection));

        // arrayToMap
        Integer[] input = {1, 2, 1, 2, 5};

        System.out.println("Array to map: " + CollectionTasks.arrayToMap(input));
    }
}