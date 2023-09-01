package validpalindrome;

/**
 * @author Dm.Petrov
 * DATE: 15.03.2023
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
         int start =0;
         int end = s.length()-1;
         while (start<end){
             if(s.charAt(start)!=s.charAt(end)){
                 return false;
             }
             start++;
             end--;
         }
         return true;
    }
}
