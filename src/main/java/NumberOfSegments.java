/**
 * @author Dm.Petrov
 * DATE: 13.12.2023
 */
public class NumberOfSegments {
    public static int countSegments(String s) {
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
       int counter = 0;
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i)==' '&&s.charAt(i-1)!=' '){
                counter++;
            }
        }
        return counter+1;
    }

    public static void main(String[] args) {
        System.out.println(countSegments( "                "));
    }
}
