package min_moves;

import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 10.09.2023
 */
public class MinMoves {
    public static void main(String[] args) {
        System.out.println(minMoves2(new int[]{1,2,3}));
    }
    public static int minMoves2(int[] nums) {
        int result =0;
        Arrays.sort(nums);
        int num = nums[nums.length/2];
        for (int i = 0; i < nums.length; i++) {
            result+=Math.abs(nums[i]-num);
        }
        return result;
    }
}
