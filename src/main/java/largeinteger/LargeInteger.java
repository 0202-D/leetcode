package largeinteger;

/**
 * @author Dm.Petrov
 * DATE: 30.04.2023
 */
public class LargeInteger {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[digits.length - 1] == 9) {
            return new int[]{1, 0};
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] != 10) {
                break;
            }
            else{digits[i]=0;}
            if (i == 0 && digits[0]==0){
                int [] arr = new int[digits.length+1];
                System.arraycopy(digits, 0, arr, 1, arr.length - 1);
                arr[0]=1;
                return arr;
            }
        }
        return digits;
    }
}
