package TCS_NumberSystem;

import java.util.ArrayList;

public class Fibonacci {
//    static void main(String[] args) {
//        int N = 1;
//        int i = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        while (i<=N) {
//            if(i == 0 || i == 1) {
//                list.add(i);
//                i++;
//            }
//            else {
//                list.add(list.get(i-2)+list.get(i-1));
//                i++;
//            }
//        }
//        System.out.println(list);
//    }

    public static int fibonacci(int N) {
        // Base case: return N if it's 0 or 1
        if (N <= 1) {
            return N;
        }

        // Recursive case: calculate previous two terms
        int last = fibonacci(N - 1);    // (N-1)th term
        int slast = fibonacci(N - 2);   // (N-2)th term

        return last + slast;
    }

    public static void main(String[] args) {
        int N = 3;
        System.out.println(fibonacci(N));  // Output: 3
    }
}
