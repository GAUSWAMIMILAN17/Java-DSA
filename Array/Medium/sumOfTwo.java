package Array.Medium;

import java.util.Arrays;

public class sumOfTwo {

    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = sumOfTwo(arr, 6);

        if (result[0] != -1) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No two elements sum to the target.");
        }
        System.out.println(optimum(arr,6));
    }
    public static  int [] sumOfTwo(int []arr , int target){
        for(int i=0 ; i<arr.length ;i++){
            for( int j=i+1; j<arr.length ; j++){

                if((arr[i]+arr[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    private static boolean optimum(int [] arr , int target){
        //sort the array
        Arrays.sort(arr);
        int n = arr.length;
        // left pointer
        int left = 0 ;
        //right pointer
        int right = n-1;

        while(left<right){

            if((arr[left]+arr[right])==target){
                return true;
            }
            // as the array is sorted
            // then if sum< target then we need some number to add so increment left++
            else if ((arr[left]+arr[right])<target) {
                left++;
            }
            //if sum>target then we need less value
            else{
                right--;
            }
        }
        return false;

    }
}
