package Recursion;

import java.util.ArrayList;

public class kSumofSubsequences {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(9);
        arr.add(2);
        arr.add(5);
        arr.add(1);

        int k = 10;

        printSubsequences(arr, 0, new ArrayList<>(), 0, k);
    }

    public static void printSubsequences(
            ArrayList<Integer> arr,
            int index,
            ArrayList<Integer> res,
            int sum,
            int k) {
            int count = 0;
        // Base case
        if (index == arr.size()) {
            if (sum == k) {
                System.out.println(res);
            }
            return;
        }

        // PICK current element
        res.add(arr.get(index));
        printSubsequences(arr, index + 1, res, sum + arr.get(index), k);

        // BACKTRACK
        res.remove(res.size() - 1);

        // NOT PICK current element
        printSubsequences(arr, index + 1, res, sum, k);
    }
}
