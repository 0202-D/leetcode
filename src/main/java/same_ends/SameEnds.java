package same_ends;

/**
 * @author Dm.Petrov
 * DATE: 23.07.2023
 */
public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        int start = 0;
        int end = 0;
        int i =0 ;
        int j = nums.length-1;
        while (i!=len){
            start+=nums[i++];
            end+=nums[j--];
        }
        return start==end;
    }
}
