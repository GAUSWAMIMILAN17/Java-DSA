package TCS_String;

import java.util.HashMap;
import java.util.Map;

public class anagram {
    static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT";
//        char[] ch1 = s1.toCharArray();
//        char[] ch2 = s2.toCharArray();
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        System.out.println(checkAnagram(ch1, ch2));
        System.out.println(optAnagram(s1,s2));

    }

//    public static boolean checkAnagram(char[] a, char[] b) {
//        if(a.length != b.length) {
//            return false;
//        }
//        for(int i = 0; i<a.length; i++) {
//            if(a[i] != b[i]) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean optAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease frequency using s2
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            // Character not present in s1
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            // More occurrences in s2 than s1
            if (map.get(ch) < 0) {
                return false;
            }
        }

        // Verify all frequencies are zero
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
