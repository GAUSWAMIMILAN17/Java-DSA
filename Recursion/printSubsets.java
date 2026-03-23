package Recursion;

import java.util.ArrayList;

public class printSubsets {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        printSubsets(arr, res, 0);
    }

    static void printSubsets(ArrayList<Integer> arr, ArrayList<Integer> res, int i) {

        // base case
        if (i == arr.size()) {
            System.out.println(res);
            return;
        }

        // include
        res.add(arr.get(i));
        printSubsets(arr, res, i + 1);

        // backtrack
        res.remove(res.size() - 1);

        // exclude
        printSubsets(arr, res, i + 1);
    }
}
