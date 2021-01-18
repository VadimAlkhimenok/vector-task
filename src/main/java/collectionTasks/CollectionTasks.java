package collectionTasks;

import java.util.*;

public class CollectionTasks {

    public static <K, V> Map <V, Collection<K>> inverse(Map<K, V> collection) {
        HashMap<V, Collection<K> > output = new HashMap<>();

        for (Map.Entry<K, V> entry : collection.entrySet()) {
            Collection<K> newVal;

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

    public static <K> Map <K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> output = new HashMap<>();

        for (K item : ks) {
            if (output.containsKey(item)) {
                output.put(item, output.get(item)+1);
            } else {
                output.put(item, 1);
            }
        }
        return output;
    }
}






