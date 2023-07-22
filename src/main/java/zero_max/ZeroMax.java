package zero_max;

/**
 * @author Dm.Petrov
 * DATE: 22.07.2023
 */
public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        boolean isOdd = false;
        int maxOdd = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                maxOdd = Math.max(nums[i], maxOdd);
                isOdd = true;
            }
            if(nums[i]==0&&isOdd){
                nums[i]=maxOdd;
            }
        }
        return nums;
    }
}
