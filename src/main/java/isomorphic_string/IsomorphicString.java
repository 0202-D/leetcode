package isomorphic_string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dm.Petrov
 * DATE: 03.05.2023
 */
public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        int[] arrOne = new int[256];
        int[] arrTwo = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char one = s.charAt(i);
            char two = t.charAt(i);
            if (arrOne[one] != arrTwo[two]) {
                return false;
            }
            arrOne[one] = i + 1;
            arrTwo[two] = i + 1;
        }
        return true;

    }
}
