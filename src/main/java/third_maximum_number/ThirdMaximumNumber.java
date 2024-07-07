package third_maximum_number;

import java.util.Arrays;


public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length > 2) {
            int [] arrayWithoutDuplicates = Arrays.stream(nums)
                    .distinct()
                    .toArray();
            if(arrayWithoutDuplicates.length<3){
                return arrayWithoutDuplicates[arrayWithoutDuplicates.length-1];
            }
            else {
                return arrayWithoutDuplicates[arrayWithoutDuplicates.length-3];
            }
        } else {
            return nums[nums.length - 1];
        }
    }
}
