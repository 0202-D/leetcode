package fizzbuzz;

/**
 * @author Dm.Petrov
 * DATE: 06.04.2023
 */
public class FizzBuzzTwo {
    public String fizzBuzz(int num){
        StringBuilder sb = new StringBuilder();
        if(num%3==0){sb.append("Fizz");}
        if(num%5==0){sb.append("Buzz");}
        if(sb.length()==0){throw new RuntimeException("some message");}
        return sb.toString();
    }

}
