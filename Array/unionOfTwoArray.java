package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr2[]={4,5,6,7,8,10};

        unionBruteforce(arr,arr2);


    }

    public static void unionBruteforce( int[] arr, int[] arr2){
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }

        System.out.println(set);
    }
}
