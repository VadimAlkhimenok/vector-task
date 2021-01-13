package collectionTasks;

import java.util.*;

public class InverseCollection {

    public static <String, Shape> Map inverse(Map<String, Shape> collection) {
        HashMap<Shape, Collection<String> > output = new HashMap<>();

        for (Map.Entry<String, Shape> entry : collection.entrySet()) {
            Collection<String> newVal;

            if (output.containsKey(entry.getValue())) {
                newVal = output.get(entry.getValue());
            } else {
                newVal = new ArrayList<>();
            }

            newVal.add(entry.getKey());
            output.put(entry.getValue(), newVal);
        }

        return output;
    }
}