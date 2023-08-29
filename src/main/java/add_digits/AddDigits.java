package add_digits;

/**
 * @author Dm.Petrov
 * DATE: 29.08.2023
 */
public class AddDigits {
    public int addDigits(int num) {
        while (true) {
            num = sum(num);
            if(num/10==0){break;}
        }
        return num;
    }

    public int sum(int num) {
        int result = 0;
        while (num > 0) {
            int digit = num%10;
            result += digit;
            num = num / 10;
        }
        return result;
    }
}
