package Array;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {



        int[] arr = {1,4,2,7,3};


        int sMax = Integer.MIN_VALUE;
        int Max = arr[0];

        for(int i =0; i< arr.length; i++) {
            if(arr[i] > Max) {
                sMax = Max;
                Max = arr[i];
            }
        }
        System.out.println(sMax);
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
