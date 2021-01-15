package collectionTasks;

import classHierarchy.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // inverse
        Map<String, Shape> collection = new HashMap<>();

        Shape ball = new Ball(5);
        Shape cylinder = new Cylinder(5 ,5);
        Shape pyramid = new Pyramid(5, 5);

        collection.put("1", ball);
        collection.put("2", ball);
        collection.put("3", pyramid);
        collection.put("4", pyramid);
        collection.put("5", cylinder);
        collection.put("6", cylinder);

        System.out.println("Inverse");
        System.out.println(CollectionTasks.inverse(collection));

        Map<Shape, Collection<String>> result = CollectionTasks.inverse(collection);
        System.out.println();
        System.out.println("Result ball: " + result.get(new Ball(5)));
        System.out.println("Result pyramid: " + result.get(new Pyramid(5, 5)));
        System.out.println("Result cylinder: " + result.get(new Cylinder(5, 5)));
        System.out.println("Size: " + result.size());

        // arrayToMap
        Integer[] input = {1, 2, 1, 2, 5};

        System.out.println();
        System.out.println("Array to map");
        System.out.println(CollectionTasks.arrayToMap(input));
    }
}