import java.util.*;
import java.util.Map.Entry;

public class SortByValueHashMap {

    public static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();

        Set<Entry<String, Integer>> entrySet = scores.entrySet();
        System.out.println(entrySet);

        List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println(entryList);

        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);

        // populate the new hash map
        for (Entry<String, Integer> e : entryList)
            sortedByValue.put(e.getKey(), e.getValue());

        return sortedByValue;

    }
}
