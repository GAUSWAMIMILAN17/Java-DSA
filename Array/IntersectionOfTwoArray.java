package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArray {
    static void main(String[] args) {
        int arr1[] = {1,2,2,3,4,5};
        int arr2 [] = {1,1, 3,3 ,5};
        List<Integer > list = intersection(arr1,arr2);
        System.out.println("Brut force : "+list);
        List<Integer >list2 = optimumSol(arr1,arr2);
        System.out.println("Optimum solution : "+list2);
    }

    static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> list  = new ArrayList<>();
        int visted[] =new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
//
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i] && visted[j] == 0) {
                    list.add(arr1[i]);
                    visted[j] = 1;
                    break;
                }
                if(arr2[j] > arr1[i]){
                    break;
                }
            }

        }
        return list;

    }
    static List<Integer> optimumSol(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int i =  0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            }
             else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return list;
    }

    //1 1 2 3 3 4 4
    //1 1 2 2 4 4 5
}
