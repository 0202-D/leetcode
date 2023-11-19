package ransom_note;


/**
 * @author Dm.Petrov
 * DATE: 19.11.2023
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder str = new StringBuilder(magazine);
        int counter = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (ransomNote.charAt(i) == str.charAt(j)) {
                    str.deleteCharAt(j);
                    counter++;
                    if (counter == ransomNote.length()) {
                        return true;
                    }
                    break;
                }
            }
            if(counter<=i){
                return false;
            }
        }
        return true;
    }
}
