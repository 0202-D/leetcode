package romantointeger;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dm.Petrov
 * DATE: 25.02.2023
 */
public class RomanToInteger {
    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D',500);
        map.put('M',1000);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("VII"));
    }

    private static int romanToInt(String number) {
        int result = 0;
        int prev = 0;
        for (int i = number.length()-1; i >= 0; i--) {
            if (map.get(number.charAt(i)) < prev) {
                result -= map.get(number.charAt(i));
            } else {
                result += map.get(number.charAt(i));
            }
            prev = map.get(number.charAt(i));
        }
        return result;
    }
}