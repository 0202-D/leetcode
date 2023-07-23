package make_middle;

/**
 * @author Dm.Petrov
 * DATE: 23.07.2023
 */
public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        if(nums.length==2){
            return nums;
        }
        int two = nums[nums.length/2];
        int one = nums[nums.length/2-1];
        return new int[]{one,two};
    }
}
