/**
 * @author Dm.Petrov
 * DATE: 09.01.2024
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        double a = Math.log(n) / Math.log(3);
        return Math.abs(a - Math.round(a)) < 1e-10;
    }
}
