package Array;

public class ArrayisSorted {
    static void main(String[] args) {
        int [] arr = {7,2,3,4,5};
        System.out.println(isSorted(arr));
        System.out.println("optimal " + Sorted(arr));
    }

    public static boolean isSorted(int [] arr) {

        for (int i = 0; i< arr.length; i++) {
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Sorted(int [] arr) {
        for (int i = 1; i< arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;

    }
}
