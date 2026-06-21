package Recursion;

public class atoi_1_Implimentation {

    static void main() {
        String s = " -41a93";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        int i =0;
        while(i<s.length() && s.charAt(i) == ' ') i++;
        int sign =1;
        while(i< s.length() && s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-' ? -1 : 1);
            i++;
        }

        return helper(s, i, 0, sign);
    }

    public static int helper(String s, int i , int num, int sign) {

        if(i>=s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) num * sign;
        }
        num = num * 10 + (s.charAt(i) - '0');
        return helper(s, i+1,num, sign);

//        while (i<s.length() && Character.isDigit(s.charAt(i))) {
//            num = num * 10 + (s.charAt(i) - '0');
//            i++;
//        }
//
//        return num * sign;

    }
}
