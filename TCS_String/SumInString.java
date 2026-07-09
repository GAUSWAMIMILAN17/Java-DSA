package TCS_String;

public class SumInString {
    public static void main(String[] args) {
        String s = "12abc20xy5";

        System.out.println(sumOfNumbers(s));
    }

    public static int sumOfNumbers(String s) {
        int sum = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                sum += num;
                num = 0;
            }
        }

        // Add the last number if the string ends with digits
        sum += num;

        return sum;
    }
}
