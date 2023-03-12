import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import validanagram.ValidAnagram;

/**
 * @author Dm.Petrov
 * DATE: 12.03.2023
 */
public class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();
    @Test
    void test1(){
        boolean expected = true;
        boolean result = validAnagram.isValid("anagram","nagaram");
        Assertions.assertEquals(result,expected);
    }
    @Test
    void test2(){
        boolean expected = false;
        boolean result = validAnagram.isValid("rat","car");
        Assertions.assertEquals(result,expected);
    }
}
