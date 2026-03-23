package Array;

import java.util.HashMap;

public class subArraySumofK {
    public static void main(String[] args) {

        int[] arr = {9, 4, 20, 3, 10, 5};
        int k = 33;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}