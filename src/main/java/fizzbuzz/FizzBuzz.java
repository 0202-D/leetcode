package fizzbuzz;

import java.util.Optional;

/**
 * @author Dm.Petrov
 * DATE: 05.04.2023
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(17));
    }
    public static String fizzBuzz(int num){
        String result = Optional.of(num).map(el->(el%3==0?"Fizz":"")+(el%5==0?"Buzz":"")).get();
        return result.isEmpty()?Integer.toString(num):result;
    }
}
