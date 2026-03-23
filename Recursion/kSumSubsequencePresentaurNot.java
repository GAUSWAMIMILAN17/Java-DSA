package Recursion;

import java.util.ArrayList;

public class kSumSubsequencePresentaurNot {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int k = 10;

        boolean exists = sumSubsequences(arr, k, 0, 0);

        if (exists) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean sumSubsequences(
            ArrayList<Integer> arr,
            int k,
            int index,
            int sum) {

        // Base case
        if (index == arr.size()) {
            return sum == k;
        }

        // PICK
        if (sumSubsequences(arr, k, index + 1, sum + arr.get(index))) {
            return true;   // early stop
        }

        // NOT PICK
        if (sumSubsequences(arr, k, index + 1, sum)) {
            return true;
        }

        return false;
    }
}
