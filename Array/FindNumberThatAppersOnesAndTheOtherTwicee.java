package Array;

public class  FindNumberThatAppersOnesAndTheOtherTwicee {
    static void main(String[] args) {
        int []arr={1,1,2,2,3,3,4,4,5,5,7,6,6};
        System.out.println("Brut Force approach o(n^2) : "+brutForce(arr));
        System.out.println("Optimum Force approach o(n) : "+optimum(arr));
    }

    public static int brutForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }
    private static int optimum(int []nums){
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all elements
        }
        return result;
    }
}
