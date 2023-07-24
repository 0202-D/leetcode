package new_is_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewIsPalindromeTest {
    NewIsPalindrome newIsPalindrome = new NewIsPalindrome();
    @Test
    void test1(){
        boolean expected = true;
        boolean actual = newIsPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        boolean expected = false;
        boolean actual = newIsPalindrome.isPalindrome("Race a car");
        assertEquals(expected,actual);
    }

}