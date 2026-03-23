package Bit_MANIPULATION;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ((n&1)==1){
            System.out.println("number is odd");
        }
        else System.out.println("number is even");

    }
}
