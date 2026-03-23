package Array;

import java.util.Arrays;

public class rotationOptimal {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        int n = arr.length;
        d = d % n;

           // 7 6 5 4 3 2 1
        reverse(arr,0,d-1);   //
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr, int left , int right){

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
