package Array;

import java.sql.SQLOutput;
import java.util.*;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {4, 5, 6, 7, 8, 10};

        System.out.println(unionBruteforce(arr, arr2));
        System.out.println(mapBruteForce(arr,arr2));

    }
    public static List<Integer> mapBruteForce(int[] arr, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int j =0; j< arr2.length; j++) {
            map.put(arr2[j], map.getOrDefault(arr2[j], 0)+1);
        }

        for(int key : map.keySet()) {
            list.add(key);
        }

        return list;
    }
    public static Set<Integer> unionBruteforce(int[] arr, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (!set.contains(arr2[j])) {
                set.add(arr2[j]);
            }
        }

        return set;

    }
}
