package findtheindex;

/**
 * @author Dm.Petrov
 * DATE: 14.03.2023
 */
public class FindTheIndex {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String hayStack, String needle) {
        for (int i = 0; i < hayStack.length(); i++) {
            if (hayStack.charAt(i) == needle.charAt(0)) {
                int length = hayStack.length() - i;
                if (length < needle.length()) {
                    return -1;
                }
                if (hayStack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;

    }
}
