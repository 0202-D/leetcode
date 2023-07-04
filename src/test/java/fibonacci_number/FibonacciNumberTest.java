package fibonacci_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {
    FibonacciNumber fibonacciNumber = new FibonacciNumber();
    @Test
    void test1(){
        int expected = 1;
        int actual = fibonacciNumber.fib(2);
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        int expected = 2;
        int actual = fibonacciNumber.fib(3);
        assertEquals(expected,actual);
    }

}