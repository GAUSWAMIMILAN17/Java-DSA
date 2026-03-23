package Array.Medium;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    static void main(String [] args) {
        int [] arr = { 100, 4, 200, 1, 3, 2, 5, 101, 102, 103};
        System.out.println("Brute force : " + bruteforce(arr));
        System.out.println("optimal force : " + optimal(arr));
    }

    public static int bruteforce(int[] arr) {
        int longest = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int currentStack = 1;

            while(linearSearch (arr, num+1)) {
                num++;
                currentStack++;
            }
            longest = Math.max(longest, currentStack);

        }
        return longest;
    }

    public static boolean linearSearch(int[] arr, int target) {

        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static int optimal(int [] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        int longest = 0;
        for (int num : set) {
            if(!set.contains(num-1)) {
                int currentStack = num;
                int count = 1;
                while(set.contains(currentStack + 1)) {
                    currentStack++;
                    count++;
                }
                longest =  Math.max(longest, count);
            }
        }
        return longest;
    }
}
