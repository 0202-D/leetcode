package containcs_duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    @Test
    void test1(){
        boolean excepted = true;
        boolean actual = containsDuplicate.containsDuplicate(new int [] {1,2,3,1});
        assertEquals(excepted,actual);
    }
    @Test
    void test2(){
        boolean excepted = false;
        boolean actual = containsDuplicate.containsDuplicate(new int [] {1,2,3,4});
        assertEquals(excepted,actual);
    }
}