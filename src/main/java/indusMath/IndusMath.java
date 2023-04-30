package indusMath;

import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 23.03.2023
 */
public class IndusMath {
    public static void main(String[] args) {
        System.out.println(indMath(111));
    }
    public static int indMath(int a){
        String s  = Integer.toString(a);
        String one ="";
        String two = "";
        String [] arr = s.split("");
        int [] arr1 = new int[arr.length];
        int [] arr2 = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=Integer.valueOf(arr[i]);
        }
        Arrays.sort(arr1);
        for (int i = arr.length-1; i >=0; i--) {
            arr2[i]=arr1[i];
            one +=Integer.toString(arr2[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            two +=Integer.toString(arr2[i]);
        }
         return Integer.parseInt(one)-Integer.parseInt(two);
    }
}
