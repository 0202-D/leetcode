package longestsubstring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dm.Petrov
 * DATE: 31.03.2023
 */
public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(  "bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            set.add(s.charAt(j));
        }
        if (set.size() == s.length()) {
            return s.length();
        }
        List<Character> list = new ArrayList<>();
        int sum = 0;
        int finalSum = 0;
            for (int i = finalSum; i < s.length(); i++) {
                if (list.contains(s.charAt(i))) {

                    if (list.size() > sum) {
                        sum = list.size();
                    }
                    list.clear();
                    finalSum++;
                    i=finalSum;
                }

                list.add(s.charAt(i));
            }

        return Math.max(sum, list.size());
    }
}
