package majorityelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    MajorityElement majorityElement = new MajorityElement();

    @Test
    void test1() {
        int expected = 3;
        int actual = majorityElement.majorityElement(new int[]{3, 2, 3});
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int expected = 2;
        int actual = majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        assertEquals(expected, actual);
    }
    @Test
    void test3() {
        int expected = 5;
        int actual = majorityElement.majorityElement(new int[]{6,5,5});
        assertEquals(expected, actual);
    }
    @Test
    void test4() {
        int expected = 7;
        int actual = majorityElement.majorityElement(new int[]{8,8,7,7,7});
        assertEquals(expected, actual);
    }
}