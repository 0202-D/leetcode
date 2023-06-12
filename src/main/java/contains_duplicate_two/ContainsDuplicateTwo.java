package contains_duplicate_two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dm.Petrov
 * DATE: 12.06.2023
 */
public class ContainsDuplicateTwo {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 1, 0, 1}, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

