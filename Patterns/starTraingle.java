package Patterns;

public class starTraingle {
    static void main() {
//        *
//        * *
//        * * *
//        * * * *  below
//        for (int i= 0; i<=3; i++) {
//            for (int j= 0; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        for (int i= 1; i<=4; i++) {
//            for (int j= 1; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        for (int i= 1; i<=4; i++) {
//            for (int j= 1; j<=i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        * * * *
//        * * *
//        * *
//        *
//        for (int i= 4; i>=1; i--) {
//            for (int j= 1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        1 2 3 4
//        1 2 3
//        1 2
//        1
//        for (int i=4; i>=1; i--) {
//            for (int j=1; j<=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        1
//        2 3
//        4 5 6
//        7 8 9 10

//        int rows = 4;
//        int num = 1;
//
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num);
//                num++;
//            }
//            System.out.println();
//        }

//        1
//        0 1
//        1 0 1
//        0 1 0 1
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }
}
