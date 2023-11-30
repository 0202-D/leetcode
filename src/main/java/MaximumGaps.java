import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 30.11.2023
 */
public class MaximumGaps {
    public int maximumGap(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) > result) {
                result = Math.abs(nums[i] - nums[i + 1]);
            }
        }
        return result;
    }
}
