package LongestCommonPrefix;

import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 27.02.2023
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longest(new String[]{"flower","flower","flower","flower"}));
    }
    public static String longest(String [] strs){
        String res = "";
        if(strs[0].isEmpty()){return res;}

        for (int i = 0; i <strs[0].length() ; i++) {
            for (int j = 1; j < strs.length; j++) {
                if(i==strs[j].length()){return res;}
                if (strs[0].charAt(i)!= strs[j].charAt(i)){
                    return res;
                }
            }
            res+=strs[0].charAt(i);
        }
        return res;
    }
}
