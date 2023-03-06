package singlenumber;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dm.Petrov
 * DATE: 06.03.2023
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 1, 2, 2, 3}));
    }

    public static int singleNumber(int[] nums) {
        int counter = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],counter);
            }
            else{
                map.put(nums[i],(map.get(nums[i])+1));
            }

        }
        int result = 0;
        for (Map.Entry entry: map.entrySet()
             ) {
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue().equals(1)){

                result= Integer.valueOf(entry.getKey().toString());
            }

        }
        return result;
    }
}
