package String;

import java.util.Scanner;

public class DecimalInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        System.out.println(input);

//            double num = Double.parseDouble(input);
//            if (num % 1 == 0 &&
//                    num >= Integer.MIN_VALUE &&
//                    num <= Integer.MAX_VALUE) {
//                System.out.println("Can be denoted as int");
//            } else {
//                System.out.println("Cannot be denoted as int");
//            }
        System.out.println(check(input));

    }

    public static String check(String input) {
        int pos = input.indexOf(".");
        System.out.println(pos);
        if (pos == -1) {
            return "Yes";   // No15 decimal point, so it's an integer
        }
        for(int i = pos+1; i<input.length(); i++){
            if(input.charAt(i) != '0') return "No";
        }
        return "Yes";
    }

}
