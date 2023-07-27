package word_count;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dm.Petrov
 * DATE: 27.07.2023
 */
public class WordCount {
    public class Exercise {
        public Map<String, Integer> wordCount(String[] strings) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < strings.length; i++) {
                if (map.containsKey(strings[i])) {
                    map.put(strings[i], map.get(strings[i]) + 1);
                }
                else {
                    map.put(strings[i],1);
                }
            }
            return map;
        }
    }
}
