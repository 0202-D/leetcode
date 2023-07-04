package fibonacci_number;

/**
 * @author Dm.Petrov
 * DATE: 04.07.2023
 */
public class FibonacciNumber {
    public int fib(int n) {
        if (n == 1) {
            return 1;
        }
        int one = 0;
        int two = 1;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
