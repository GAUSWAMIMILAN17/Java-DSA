package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {1,1,2,3,3,4,5};

        int index = 1; // second position thi start

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.println("Unique count: " + index);

        for(int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }
    }
}