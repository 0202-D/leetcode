import largeinteger.LargeInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Dm.Petrov
 * DATE: 30.04.2023
 */
public class LargeIntegerTest {
    LargeInteger largeInteger = new LargeInteger();

    @Test
    void testOne(){
        int [] expect = new int [] {1,2,3,4};
        int [] result = largeInteger.plusOne(new int [] {1,2,3,3});
        Assertions.assertArrayEquals(expect,result);
    }
    @Test
    void testTwo(){
        int [] expect = new int [] {1,0};
        int [] result = largeInteger.plusOne(new int [] {9});
        Assertions.assertArrayEquals(expect,result);
    }
    @Test
    void testThree(){
        int [] expect = new int [] {1,0,0};
        int [] result = largeInteger.plusOne(new int [] {9,9});
        Assertions.assertArrayEquals(expect,result);
    }
    @Test
    void testFour(){
        int [] expect = new int [] {1,9,0};
        int [] result = largeInteger.plusOne(new int [] {1,8,9});
        Assertions.assertArrayEquals(expect,result);
    }
}
