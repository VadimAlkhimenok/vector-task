package collectionTasks;

import java.util.*;

public class InverseCollection {

    public static Map<Object, Object> inverse(Map<Integer, Object> collection) {
        Map<Object, Object> output = new HashMap<>();

        for (Map.Entry<Integer, Object> item : collection.entrySet()) {
            output.put(item.getValue(), item.getKey());
        }
        return output;
    }
}
