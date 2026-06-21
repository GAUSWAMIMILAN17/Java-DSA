package Array.Medium;

public class BuyingAndSellingTheStock {

    static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        int minb = prices[0];
        int maxp = 0;

        for(int i = 1; i < prices.length; i++) {
            if(minb > prices[i]) {
                minb = Math.min(minb,prices[i]);
            } else {
                maxp = Math.max(maxp, prices[i]-minb);
            }
        }
        System.out.println(maxp);
    }
}
