package big_diff;

/**
 * @author Dm.Petrov
 * DATE: 28.07.2023
 */
public class BigDiff {
    public int bigDiff(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        return max-min;
    }
}
