package String.Leetcode;

import java.util.HashSet;

public class _392_isSubsequence {
    static void main(String[] args) {
        String s = "abc";
        String t = "agbdcs";

        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {

        int i =0;
        int j =0;
        if(s.length()==0) return true;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
                j++;


            if(i==s.length()){
                return true;
            }
        }

        return false;
    }
}
