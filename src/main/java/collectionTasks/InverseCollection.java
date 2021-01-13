package collectionTasks;

import classHierarchy.Shape;

import java.util.*;

public class InverseCollection {

    public static <String, Shape> Map inverse(Map<String, Shape> collection) {
        Map<Shape, Set<String> > output = new HashMap<Shape, Set<String> >();

        for (Map.Entry<String, Shape> entry : collection.entrySet()) {
            Shape oldVal = entry.getValue();
            String oldKey = entry.getKey();
            Set<String> newVal;

            if (output.containsKey(oldVal)) {
                newVal = output.get(oldVal);
            } else {
                newVal = new HashSet<>();
            }

            newVal.add(oldKey);
            output.put(oldVal, newVal);
        }

        return output;
    }
}