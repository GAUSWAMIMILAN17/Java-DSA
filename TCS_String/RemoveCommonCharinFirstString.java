package TCS_String;

import java.util.HashSet;

public class RemoveCommonCharinFirstString {
    static void main(String[] args) {
        String s = "abcabc";
        String b = "x";

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        // Store all characters of the second string
        for (int i = 0; i < b.length(); i++) {
            set.add(b.charAt(i));
        }

        // Keep only characters not present in the second string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!set.contains(ch)) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
    }

