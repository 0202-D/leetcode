package ransomnote;

/**
 * @author Dm.Petrov
 * DATE: 18.05.2023
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote,String magazine){
        for (int i = 0; i <ransomNote.length() ; i++) {
            if(!magazine.contains(String.valueOf(ransomNote.charAt(i)))){return false;
             }
           magazine= magazine.replaceFirst(String.valueOf(ransomNote.charAt(i)),"");
        }
        return true;
    }
}
