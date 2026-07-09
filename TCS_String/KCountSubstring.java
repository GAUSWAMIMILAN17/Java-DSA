package TCS_String;

import java.util.HashMap;
import java.util.Scanner;

public class KCountSubstring {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),1);
            } else {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
            }
        }
        System.out.println(map);
    }
}
