package BinerySearch;

public class sqrRootofNumber {

    public static void main(String[] args) {

        int n = 28;
        int low = 0;
        int high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid > n) {
                high = mid - 1;
            } else {
                ans = mid;   // store possible answer
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}