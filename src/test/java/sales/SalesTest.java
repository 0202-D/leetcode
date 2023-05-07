package sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    Sales sales = new Sales();
    @Test
    void test1(){
        int expected = 5;
        int actual = sales.bestProfit(new int [] {7,1,5,3,6,4});
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        int expected = 0;
        int actual = sales.bestProfit(new int [] {7,6,4,3,1});
        assertEquals(expected,actual);
    }

}