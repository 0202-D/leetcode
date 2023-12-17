package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dm.Petrov
 * DATE: 17.12.2023
 */
public class FizzBuzzThree {
    public List<String> fizzBuzz(int n) {
       List<String>result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(i%3==0&&i%5==0){
                result.add("FizzBuzz");
            }
            if(i%3==0){
                result.add("Fizz");
            }
            if(i%5==0){
                result.add("Buzz");
            }
           if(i%3!=0&&i%5!=0) {result.add(Integer.toString(i));}
        }
        return result;
    }
}
