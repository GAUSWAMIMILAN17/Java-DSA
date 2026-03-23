package Stacks;

import java.util.Stack;

public class stockSpan {
    static void main() {
        int[] price = {10, 4, 5, 90, 120, 80};
        stockCount(price);
    }
    public static void stockCount(int[] price) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < price.length; i++) {
            int count = 1; // atleast 1 (current day)

            for (int j = i - 1; j >= 0; j--) {
                if (price[j] <= price[i]) {
                    count++;
                } else {
                    break; // 🔥 important (stop when greater found)
                }
            }

            stack.push(count);
        }

        System.out.println(stack);
    }
}
