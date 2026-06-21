package Array.Medium;
import java.util.Arrays;

public class twoSum {

    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        int target = 14;
//        System.out.println(twoSum(arr,target));  //reference print
//        System.out.println(Arrays.toString(twoSum(arr, target)));  // actual array print

        System.out.println(Arrays.toString(opttwoSum(arr,target)));

    }

    public static int[] twoSum(int[] arr, int target) {

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }

    public static int[] opttwoSum(int [] arr, int target) {

        int left =0; int right = arr.length-1;

        while(left <right) {
            if(arr[left] + arr[right] == target) {
                return new int[] {left,right};
            }
            else if (arr[left] + arr[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }


        return new int[] {-1,-1};
    }
}
