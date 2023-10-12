import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    void test1() {
        boolean expected = true;
        boolean actual = isSubsequence.isSubsequence("abc", "ahbgdc");
        assertEquals(expected, actual);
    }

}