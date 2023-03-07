package MoveZeroes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dm.Petrov
 * DATE: 07.03.2023
 */
public class MoveZeroes {
    public int [] moveZeroes(int [] nums){
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        int result = nums.length-list.size();
        for (int i = 0; i <result ; i++) {
            list.add(0);
        }
        return  list.stream().mapToInt(i -> i).toArray();
    }
    public int [] moveZeroes2(int [] nums){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length-1 ; j++) {
                if(nums[j]==0){
                    nums[j]=nums[j+1];
                    nums[j+1]=0;
                }
            }
        }
        return nums;
    }
}


