package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PosNegAlternet {

    static void main() {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int[] arr = { 1, 2, -3, -4, 5, 6, -7, -8};

        System.out.println("Optimal : "  + Arrays.toString(optimal(arr)));

        for (int num : arr) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }

//        Collections.sort(pos);
//        Collections.sort(neg);

//        System.out.println(pos);
//        System.out.println(neg);
        for (int i = 0; i<pos.size();i++) {

            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);

        }

        System.out.println("Brute :" + Arrays.toString(arr));

    }

    public static int[] optimal(int[] arr) {
        int[] result = new int[arr.length];

        int posIndex = 0; // even index
        int negIndex = 1; // odd index

        for (int num : arr) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }
}
