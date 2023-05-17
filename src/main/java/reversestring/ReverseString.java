package reversestring;

/**
 * @author Dm.Petrov
 * DATE: 17.05.2023
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        char temp = '0';
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
