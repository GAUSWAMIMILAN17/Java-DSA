package String.Leetcode;

import java.util.HashMap;

public class _242_validAnagram {
    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // count ++ for s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // count -- for t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                System.out.println(false);
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        System.out.println(map.isEmpty());
    }
}