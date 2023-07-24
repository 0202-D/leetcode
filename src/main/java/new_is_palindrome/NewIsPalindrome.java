package new_is_palindrome;

import java.util.Locale;

/**
 * @author Dm.Petrov
 * DATE: 24.07.2023
 */
public class NewIsPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        s= s.toLowerCase();
        while (start<end){
            if(Character.isLetter(s.charAt(start))&&Character.isLetter(s.charAt(end))){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                else {
                    start++;
                    end--;
                }
            }
            if(!Character.isLetter(s.charAt(start))){
                start++;
            }
            if(!Character.isLetter(s.charAt(end))){
                end--;
            }
        }
        return true;
    }
}
