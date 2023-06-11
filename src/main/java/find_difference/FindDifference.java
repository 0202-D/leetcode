package find_difference;

import java.util.Arrays;

/**
 * @author Dm.Petrov
 * DATE: 07.06.2023
 */
public class FindDifference {
    public char findTheDifference(String s, String t) {
        int sumChar1 = 0;
        int sumChar2 = 0;
        for (int i = 0; i <s.length() ; i++) {
            sumChar1+=s.charAt(i);
        }
        for (int i = 0; i <t.length() ; i++) {
            sumChar2+=t.charAt(i);
        }
        return (char)(sumChar2-sumChar1);
    }
}
