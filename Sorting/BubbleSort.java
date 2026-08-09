package Sorting;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};


        for(int i = 0; i < arr.length; i++){
            int flag = 0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = 1;
                }
            }
            if(flag == 0) break;

        }

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
