import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singlenumber.SingleNumber;

/**
 * @author Dm.Petrov
 * DATE: 06.03.2023
 */
public class SingleNumberTest {
     SingleNumber singleNumber = new SingleNumber();
    @Test
    public void test1(){
        int expected = 4;
        int result = SingleNumber.singleNumber(new int[]{1,1,2,3,2,3,4});
        Assertions.assertEquals(result,expected);
    }

}
