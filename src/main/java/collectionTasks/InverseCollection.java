package collectionTasks;

import classHierarchy.Shape;

import java.util.*;

public class InverseCollection {

    public static Map inverse(Map<String, Shape> collection) {
        Map<Shape, String> output = new HashMap<>();
        ArrayList<Shape> col = new ArrayList<>();


        for (Map.Entry<String, Shape> item : collection.entrySet()) {
            if (output.containsKey(item.getValue())) {
                System.out.println(item.getKey());
                output.put(col.add(item.getValue()), item.getKey());
            }

            output.put(item.getValue(), item.getKey());
        }
        return output;
    }
}
