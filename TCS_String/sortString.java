package TCS_String;

import java.util.Arrays;

public class sortString {
    static void main(String[] args) {
        String s = "zxcbg";
        char[] a = s.toCharArray();
        Arrays.sort(a);
        String str = new String(a);
        System.out.println(str);
    }
}
