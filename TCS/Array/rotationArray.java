package TCS.Array;

public class rotationArray {

    public static void rotationArray(int[] arr, int start, int end){

        if(start >= end){ return;}

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rotationArray(arr,start+1,end-1);

    }

    public static void displayArray(int[] arr){
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void main() {

        int [] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        k = k % arr.length;

        displayArray(arr);
        rotationArray(arr, 0, arr.length-1);
        rotationArray(arr,0,arr.length-1-k);
        rotationArray(arr,arr.length-k,arr.length-1);

        displayArray(arr);


    }



}
