/**
 * @author Dm.Petrov
 * DATE: 04.12.2023
 */
public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int[] result = new int[]{-2,-2};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                start = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= start; i--) {
            if (nums[i] == target) {
                result[1] = i;
                break;
            }
        }
        return result[0] != -2 && result[1] != -2 ? result : new int[]{-1, -1};
    }

}

