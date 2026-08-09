package Sorting;

public class selectionSort {
    static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int index = 0;
        for(int i = 0; i< arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j =i; j<arr.length; j++){
                if(arr[j] < min){
                    min=arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }

        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}
