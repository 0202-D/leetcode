package happy_number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dm.Petrov
 * DATE: 27.08.2023
 */
public class HappyNumber {
    List<Integer> list = new ArrayList<>();

    public boolean isHappy(int n) {
        int res = n;
        while (res != 1) {
            res = squareSum(res);
            if (list.contains(res)) {
                return false;
            } else {
                list.add(res);
            }
        }
        return true;
    }

    public int squareSum(int n) {
        int res = 0;
        if (n / 10 == 0) {
            return n * n;
        } else {
            while (n != 0) {
                int a = n % 10;
                res += a * a;
                n = n / 10;
            }
            return res;
        }
    }
}
