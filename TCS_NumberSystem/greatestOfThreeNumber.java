package TCS_NumberSystem;

public class greatestOfThreeNumber {
    static void main(String[] args) {
        double a1 = 1.123;
        double a2 = 1.124;
        double a3 = 1.125;

        if(a1 > a2) {
            if(a1 > a3) {
                System.out.println(a1);
            } else {
                System.out.println(a3);
            }
        } else {
            if(a2 > a3) {
                System.out.println(a2);
            } else {
                System.out.println(a3);
            }
        }

        double maxNum = Math.max(a1, Math.max(a2, a3));
        System.out.println("The maximum of the three numbers is " + maxNum);


    }
}
