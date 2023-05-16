package wordpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dm.Petrov
 * DATE: 16.05.2023
 */
public class WordPattern {
    public boolean wordPattern(String pattern , String s){
        Map<Character,String> map = new HashMap<>();
        String [] arr = s.split(" ");
        if(pattern.length()!=arr.length){return false;}
        for (int i = 0; i <pattern.length() ; i++) {
            if(map.containsKey(pattern.charAt(i))&&!map.get(pattern.charAt(i)).equals(arr[i])){return false;}
            if(!map.containsKey(pattern.charAt(i))&&map.containsValue(arr[i])){return false;}
            map.put(pattern.charAt(i),arr[i]);
        }
        return true;
    }
}
