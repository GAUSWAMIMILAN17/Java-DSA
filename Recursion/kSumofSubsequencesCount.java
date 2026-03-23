package Recursion;

import java.util.ArrayList;

public class kSumofSubsequencesCount {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(9);
        arr.add(2);
        arr.add(5);
        arr.add(1);

        int k = 5;

        int count = countSubsequences(arr, 0, 0, k);
        System.out.println("Count = " + count);
    }

    public static int countSubsequences(
            ArrayList<Integer> arr,
            int index,
            int sum,
            int k) {

        // Base case
        if (index == arr.size()) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        // PICK
        int pick = countSubsequences(
                arr,
                index + 1,
                sum + arr.get(index),
                k
        );

        // NOT PICK
        int notPick = countSubsequences(
                arr,
                index + 1,
                sum,
                k
        );

        return pick + notPick;
    }
}
