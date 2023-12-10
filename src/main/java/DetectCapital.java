import java.util.Locale;

/**
 * @author Dm.Petrov
 * DATE: 10.12.2023
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word)) {
            return true;
        }
        if (word.toLowerCase().equals(word)) {
            return true;
        }
        for (int i = 1; i <word.length() ; i++) {
            if(!word.substring(i,i+1).equals(word.substring(i,i+1).toLowerCase())){
                return false;
            }
        }
        return true;
    }
}
