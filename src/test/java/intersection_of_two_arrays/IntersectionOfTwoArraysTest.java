package intersection_of_two_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {
    IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

    @Test
    void test1() {
        int[] expected = new int[]{2};
        int [] actual = intersectionOfTwoArrays.intersection(new int[]{1,2,2,1},new int[]{2,2});
        assertArrayEquals(expected,actual);
    }

}