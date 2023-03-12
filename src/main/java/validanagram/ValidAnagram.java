package validanagram;

import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 12.03.2023
 */
public class ValidAnagram {
    public boolean isValid(String s, String t) {
        String[] array = s.split("");
        Arrays.sort(array);
        String[] array2 = t.split("");
        Arrays.sort(array2);
        return Arrays.equals(array, array2);
    }
}
