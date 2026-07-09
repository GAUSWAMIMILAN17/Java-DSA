package TCS_String;

import java.util.HashMap;
import java.util.Map;

public class maxOccurenceChar {
    static void main(String[] args) {
        String s = "apple";

        HashMap<Character,Integer> map = new HashMap<>();
        int maxFreq = 0;
        char maxChar = 'a';

        for(int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar);
        System.out.println(maxFreq);
    }
}
