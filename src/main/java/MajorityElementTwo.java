import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dm.Petrov
 * DATE: 26.12.2023
 */
public class MajorityElementTwo {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length / 3 < 1) {
            return Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());
        }
        int amount = nums.length / 3;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
        ) {
            if(entry.getValue()>amount&&!result.contains(entry.getKey())){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2}));
    }
}

