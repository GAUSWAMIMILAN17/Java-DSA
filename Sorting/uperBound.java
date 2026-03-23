package Sorting;

public class uperBound {

    public static int upperBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = -1;   // default: upper bound na male to -1

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;      // possible upper bound
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // 👉 agar upper bound na male, last index return karo
        if (ans == -1) {
            return arr.length - 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,6,7};
        int target = 7;

        System.out.println(upperBound(arr, target));
    }
}
