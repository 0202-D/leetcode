package firstunique;

/**
 * @author Dm.Petrov
 * DATE: 19.05.2023
 */
public class FirstUnique {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        int index = -1;
        for (char i : s.toCharArray()) {
            if (s.indexOf(i) == s.lastIndexOf(i)) {
                return s.indexOf(i);
            } else {
                index += 1;
            }
        }
        return -1;
    }
}
