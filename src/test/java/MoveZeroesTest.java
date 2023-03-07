import MoveZeroes.MoveZeroes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Dm.Petrov
 * DATE: 07.03.2023
 */
public class MoveZeroesTest {
    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void test1() {
        int[] expected = new int[]{1, 2, 3, 0, 0};
        int[] result = moveZeroes.moveZeroes2(new int[]{0, 0, 1, 2, 3});
        Assertions.assertArrayEquals(result, expected);
    }

    @Test
    void test2() {
        int[] expected = new int[]{1, 2, 3, 0, 0};
        int[] result = moveZeroes.moveZeroes2(new int[]{1, 0, 2, 0, 3});
        Assertions.assertArrayEquals(result, expected);
    }

    @Test
    void test3() {
        int[] expected = new int[]{1, 2, 3, 0, 0};
        int[] result = moveZeroes.moveZeroes2(new int[]{1, 2, 0, 3, 0});
        Assertions.assertArrayEquals(result, expected);
    }

    @Test
    void test4() {
        int[] expected = new int[]{};
        int[] result = moveZeroes.moveZeroes2(new int[]{});
        Assertions.assertArrayEquals(result, expected);
    }
}
