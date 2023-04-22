package longest_palindrome;

/**
 * @author Dm.Petrov
 * DATE: 11.04.2023
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longest("cbbd"));

    }

    public static String longest(String s) {
        String result = "";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String target = "";
            for (int j = i; j < s.length(); j++) {
                target += s.charAt(j);
                if (reverse(target)) {
                    if (target.length() > max) {
                        max = target.length();
                        result = target;
                        if (result.length() >= s.length() - i) {
                            return result;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static boolean reverse(String s) {
        int begin = 0;
        int end = s.length()-1;
        while (begin<end){
            if(s.charAt(begin)!=s.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}