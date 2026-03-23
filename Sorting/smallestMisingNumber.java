package Sorting;

public class smallestMisingNumber {

    public static void main(String[] args) {
        int[] arr = {0,1, 2, 5, 5, 5, 6, 7};

        int expected = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == expected) {
                expected++;
            }
        }

        System.out.println("Smallest Missing Number = " + expected);
    }
}



