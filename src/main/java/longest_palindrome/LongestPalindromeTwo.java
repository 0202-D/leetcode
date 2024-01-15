package longest_palindrome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dm.Petrov
 * DATE: 15.01.2024
 */
public class LongestPalindromeTwo {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()
        ) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        boolean isOdd = false;
        int result = 0;
        for (Integer i : map.values()
        ) {
            if (i % 2 == 0) {
                result += i;
            } else {
                result += i - 1;
                isOdd = true;
            }

        }
        return isOdd ? result : result - 1;
    }
}
