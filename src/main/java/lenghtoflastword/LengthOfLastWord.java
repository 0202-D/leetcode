package lenghtoflastword;

/**
 * @author Dm.Petrov
 * DATE: 04.03.2023
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello, i am a java developer"));
    }
    public static int lengthOfLastWord(String s){
        String [] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
