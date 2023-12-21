import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 21.12.2023
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
