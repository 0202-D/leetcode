package majorityelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dm.Petrov
 * DATE: 15.05.2023
 */
public class MajorityElement {
    public int majorityElement(int[]nums){
        List<Integer> list = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(list.contains(nums[i])){i++;}
            list.add(nums[i]);
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    counter++;
                    if(counter==nums.length/2+1){
                        return nums[i];
                    }
                }
            }
            counter=0;
        }
        return nums[0];
    }
}
