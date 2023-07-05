package check_straighltline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckStraightLineTest {
    CheckStraightLine checkStraightLine = new CheckStraightLine();

    @Test
    void test1() {
        boolean expected = true;
        boolean actual = checkStraightLine.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}});
        assertEquals(expected, actual);
    }
    @Test
    void test2() {
        boolean expected = false;
        boolean actual = checkStraightLine.checkStraightLine(new int [][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}});
        assertEquals(expected, actual);
    }
    @Test
    void test3() {
        boolean expected = true;
        boolean actual = checkStraightLine.checkStraightLine(new int [][]{{0,0},{0,1},{0,-1}});
        assertEquals(expected, actual);
    }
    @Test
    void test4() {
        boolean expected = false;
        boolean actual = checkStraightLine.checkStraightLine(new int [][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}});
        assertEquals(expected, actual);
    }
}