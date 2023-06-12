package reverse_integer;

/**
 * @author Dm.Petrov
 * DATE: 12.06.2023
 */
public class ReverseInteger {
    public int reverse(int x) {
       StringBuilder number = new StringBuilder(String.valueOf(x));
       StringBuilder result = new StringBuilder();
        for (int i = number.length()-1; i >= 0; i--) {
            result.append(number.charAt(i));
        }
       if(result.charAt(result.length()-1)=='-'){
          result = new StringBuilder(result.substring(0, result.length() - 1));
           try{
           return -Integer.parseInt(result.toString());}
           catch (NumberFormatException e){
               return 0;
           }
       }
       else {
           try{
               return Integer.parseInt(result.toString());}
           catch (NumberFormatException e){
               return 0;
           }
       }
    }
}
