package TCS_NumberSystem;

public class NumberIsPaldromeorNot {
    static void main(String[] args) {
        int a = 121;
        int b = a;


        int reverse = 0;
        while(a>0){
            int ld = a % 10;
            reverse = reverse * 10 + ld;
            a = a / 10;
        }

        if(reverse == b) {
            System.out.println("palidrome");
        } else {
            System.out.println("not palidrome");
        }
    }
}
