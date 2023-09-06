package can_place_flower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowerTest {
    CanPlaceFlower canPlaceFlower = new CanPlaceFlower();
    @Test
    void test1(){
        boolean expected = true;
        boolean actual = canPlaceFlower.canPlaceFlowers(new int[]{1,0,0,0,1},1);
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        boolean expected = false;
        boolean actual = canPlaceFlower.canPlaceFlowers(new int[]{1,0,0,0,1},2);
        assertEquals(expected,actual);
    }
    @Test
    void test3(){
        boolean expected = true;
        boolean actual = canPlaceFlower.canPlaceFlowers(new int[]{1,0,0,0,1,0,0},2);
        assertEquals(expected,actual);
    }
    @Test
    void test4(){
        boolean expected = true;
        boolean actual = canPlaceFlower.canPlaceFlowers(new int[]{1,0,0},1);
        assertEquals(expected,actual);
    }
    @Test
    void test5(){
        boolean expected = false;
        boolean actual = canPlaceFlower.canPlaceFlowers(new int[]{1,0},1);
        assertEquals(expected,actual);
    }
    @Test
    void test6(){
        boolean expected = true;
        boolean actual = canPlaceFlower.canPlaceFlowers(new int[]{1,0,0,0},1);
        assertEquals(expected,actual);
    }

}