package firstunique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueTest {
    FirstUnique firstUnique = new FirstUnique();
    @Test
    void test1(){
        int expect = 0;
        int actual = firstUnique.firstUniqChar("leetcode");
        assertEquals(expect,actual);
    }
    @Test
    void test2(){
        int expect = 2;
        int actual = firstUnique.firstUniqChar("loveleetcode");
        assertEquals(expect,actual);
    }
    @Test
    void test3(){
        int expect = -1;
        int actual = firstUnique.firstUniqChar("aabb");
        assertEquals(expect,actual);
    }
    @Test
    void test4(){
        int expect = 8;
        int actual = firstUnique.firstUniqChar("dddccdbba");
        assertEquals(expect,actual);
    }

}