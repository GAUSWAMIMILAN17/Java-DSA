package Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    static void main(String[] args) {
        int [] arr = { 10, 20, 12, 3, 0, 6};

        System.out.println("bruteforce : " + bruteForce(arr));
        System.out.println("optimal : " + optimum(arr));
    }
    
    public static List<Integer> bruteForce(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static List<Integer> optimum(int [] arr)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                list.add(arr[i]);
                max=arr[i];
            }
        }
        return list;
    }
}
