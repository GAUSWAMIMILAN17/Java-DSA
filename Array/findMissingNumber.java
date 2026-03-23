package Array;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1};

        for (int i = 0; i <= arr.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println(i);
            }
        }
    }
}
