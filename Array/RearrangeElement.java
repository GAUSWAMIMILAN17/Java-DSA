package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeElement {
    static void main(String[] args) {
        int [] arr= {1,2,-4,-5};
        int [] arr1 = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > 0) {
                arr1[pos] = arr[i];
                pos += 2;
            } else {
                arr1[neg] = arr[i];
                neg += 2;
            }
        }

        for (int i =0; i<arr1.length ; i++) {
            System.out.print(arr1[i]+ " ");
        }
    }
}
