package Sorting;

import java.util.Scanner;

public class AllSortDec {
    static void main() {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int arr2[] = {9,8,7,5,4,3,2};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        countingSort(arr);
        optimizedBubbleSort(arr2);
    }
    public static void bubbleSort(int []arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        System.out.print("Bubble Sorted Array ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            int maxPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxPos]){
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Selection Sorted Array ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertionSort(int []arr){
        for (int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.print("Insertion Sorted Array ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void countingSort(int []arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int [] count = new int[largest+1];
        for(int i=0;i<arr.length-1;i++){
            count[arr[i]]++;
        }
        //sort
        int j = 0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.print("Counting Sorted Array ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swap = 0;   // swap counter

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++; // swap hua
                }
            }

            // ❗ agar koi swap nahi hua to already sorted
            if (swap == 0) {
                break;
            }
        }

        System.out.print("Optimized Bubble Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

