package Array;

import java.util.HashSet;
import java.util.Set;

public class hashsetDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,4};
        Set<Integer> hashset = new HashSet<>();
        for (int i : arr) {
            if (!hashset.contains(i)) {
                hashset.add(i);
            }
        }
        System.out.println(hashset);
    }
}
