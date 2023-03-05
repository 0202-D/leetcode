package ispalindrome;

/**
 * @author Dm.Petrov
 * DATE: 05.03.2023
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x){
      String s = Integer.toString(x);
      int j = s.length()-1;
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
