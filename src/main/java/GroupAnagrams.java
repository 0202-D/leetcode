
import java.util.*;

/**
 * @author Dm.Petrov
 * DATE: 03.12.2023
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = Arrays.toString(arr);
            if (map.containsKey(str)) {
                map.get(str).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(str, list);
            }
        }
        for (Map.Entry<String,List<String>>map1: map.entrySet()
        ) {
            result.add(map1.getValue());
        }
        return result;
    }
}
