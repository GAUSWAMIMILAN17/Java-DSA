package Array;

import java.util.Arrays;

public class nextPermutation {
    static void main(String[] args) {
        int [] arr = {3,2,1};

        System.out.println(Arrays.toString(permutation(arr)));
    }
    public static int[] permutation(int[] arr) {
        int pivot  = findPivot(arr);
        if(pivot == -1) {
            swap(arr, 0, arr.length-1);
            return arr;
        }
        for (int i = arr.length - 1; i > pivot; i--) {

            if (arr[i] > arr[pivot]) {

                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;

                break;
            }
        }
        swap(arr,pivot+1,arr.length-1);

    return arr;
    }

    public static void swap(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static int findPivot(int[] arr) {
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                return i;
            }
        }
        return -1;
    }
}
