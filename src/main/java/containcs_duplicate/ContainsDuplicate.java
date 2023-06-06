package containcs_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Dm.Petrov
 * DATE: 06.06.2023
 */
public class ContainsDuplicate {
   public boolean containsDuplicate(int [] nums){
       Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
       if(nums.length!=set.size()){
           return true;
       }
       else {
           return false;
       }
    }
}
