package BinerySearch;

public class KokoeatingBananas {
    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h = 8;
        int max = 0;
        for (int c : piles) {
            max = Math.max(c, max);
        }
        int ans = max;

        int low = 1, high = max;
        while(low <= high) {
            int mid = low + (high-low) /2;

            int hour = calculateHour(piles, mid);

            if (hour <= h) {
                ans = mid;
                high = mid - 1;
            }
            // Otherwise, try larger speed
            else {
                low = mid + 1;
            }
        }
        System.out.println(ans);

    }

    public static int calculateHour(int [] arr, int hourly) {
        int totalHours = 0;

        for (int c : arr) {

            totalHours += (c + hourly - 1) / hourly;

        }
        return totalHours;
    }
}
