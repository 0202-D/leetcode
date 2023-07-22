package most_often_symbol;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dm.Petrov
 * DATE: 22.07.2023
 */
public class MostOftenSymbol {
    public char mostOftenSymbol(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
             if(map.containsKey(str.charAt(i))){
                 map.put(str.charAt(i),map.get(str.charAt(i))+1);
             }
             else {
                 map.put(str.charAt(i),1);
             }
        }
        int max = 0;
        char result = '0';
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
          if(characterIntegerEntry.getValue()>max){
              result = characterIntegerEntry.getKey();
              max= characterIntegerEntry.getValue();
          }
        }
        return result;
        }
    }

