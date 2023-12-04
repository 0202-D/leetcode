import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastTest {
    FindFirstAndLast findFirstAndLast = new FindFirstAndLast();

    @Test
    void test1() {
        int[] expected = new int[]{3, 4};
        int[] actual = findFirstAndLast.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        assertArrayEquals(expected, actual);
    }
    @Test
    void test2() {
        int[] expected = new int[]{0, 1};
        int[] actual = findFirstAndLast.searchRange(new int[]{2,2}, 2);
        assertArrayEquals(expected, actual);
    }
    @Test
    void test3() {
        int[] expected = new int[]{0, 0};
        int[] actual = findFirstAndLast.searchRange(new int[]{1,2}, 1);
        assertArrayEquals(expected, actual);
    }
}