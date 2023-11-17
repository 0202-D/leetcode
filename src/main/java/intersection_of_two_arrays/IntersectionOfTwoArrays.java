package intersection_of_two_arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dm.Petrov
 * DATE: 17.11.2023
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] == nums2[j]) {
                if (!list.contains(nums1[i]))
                    list.add(nums1[i]);
                i++; j++;
            }
            else j++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
