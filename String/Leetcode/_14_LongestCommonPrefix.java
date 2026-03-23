package String.Leetcode;

import java.util.Arrays;

public class _14_LongestCommonPrefix {
    static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        String ans = "";

        String s1 =  str[0];
        String s2 =  str[str.length-1];

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                ans += s1.charAt(i);
            } else break;
        }
        System.out.println(ans);
    }
}
