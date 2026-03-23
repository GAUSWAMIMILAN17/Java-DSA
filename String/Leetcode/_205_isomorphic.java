package String.Leetcode;

import java.util.HashMap;

public class _205_isomorphic {
    public static void main(String[] args) {

        String s1 = "egg";
        String s2 = "add";

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        int index = 0;

        while (index < s1.length()) {

            char c1 = s1.charAt(index);
            char c2 = s2.charAt(index);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    System.out.println(false);
                    return;
                }
            } else {
                map.put(c1, c2);
            }

            // reverse check 🔥
            if (reverse.containsKey(c2)) {
                if (reverse.get(c2) != c1) {
                    System.out.println(false);
                    return;
                }
            } else {
                reverse.put(c2, c1);
            }

            index++; // ✅ important
        }

        System.out.println(true);
    }
}