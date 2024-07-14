package add_string;

import java.math.BigInteger;

public class AddString {
    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
    }

    public static String addStrings(String num1, String num2) {
        BigInteger one = new BigInteger(num1);
        BigInteger two = new BigInteger(num2);
        return String.valueOf(one.add(two));
    }
}
