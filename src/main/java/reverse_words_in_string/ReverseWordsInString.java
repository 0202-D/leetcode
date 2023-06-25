package reverse_words_in_string;

/**
 * @author Dm.Petrov
 * DATE: 25.06.2023
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
       String [] array = s.split(" ");
       StringBuilder result = new StringBuilder();
        for (int i = array.length-1; i >=0 ; i--) {
                if(!array[i].equals("")){
                    result.append(array[i]).append(" ");
                }
        }
        return result.toString().trim();
    }
}
