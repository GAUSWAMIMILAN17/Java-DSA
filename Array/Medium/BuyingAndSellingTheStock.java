package Array.Medium;

public class BuyingAndSellingTheStock {

    static void main(String[] args) {
        int [] arr = {7, 1, 5, 3, 6, 4};
        int mp = 0;
        int bb = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > bb) {
                mp = Math.max(mp, arr[i] - bb);
            }
            bb = Math.min(bb, arr[i]);
        }

        System.out.println(mp);
    }
}
