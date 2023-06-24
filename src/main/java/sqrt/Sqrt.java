package sqrt;

/**
 * @author Dm.Petrov
 * DATE: 24.06.2023
 */
public class Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int i = 1;
        long result = 1;

        while (result <= x) {
            ++i;
            result = (long) i * i;
        }

        return i - 1;
    }
}
