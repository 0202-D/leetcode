package reversevowelsofastring;

import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 21.05.2023
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        int end = array.length - 1;
        char temp = '2';
        while (start < end) {
            if (isVowel(array[start]) && isVowel(array[end])) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            } else if (isVowel(array[start])) {
                end--;
            } else {
                start++;
            }
        }

        return new String(String.valueOf(array));
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'e' || ch == 'i' || ch == 'o') {
            return true;
        }
        return false;

    }
}
