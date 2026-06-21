package Array;

import java.util.Arrays;

public class LeftRightRotateByKPlace {

    static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        int n = arr.length-1;
        String Flag = "left";
        if(Flag.equals("right")) {
            reverse(arr,0,n);
            reverse(arr,0,k-1);
            reverse(arr,k,n);
        } else {
            reverse(arr,0,n);
            reverse(arr,0,n-k);
            reverse(arr,n-k+1,n);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
