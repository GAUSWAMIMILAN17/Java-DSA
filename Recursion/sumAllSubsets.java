package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class sumAllSubsets {
    static void main() {
        int[] arr = {5,2,1};
        int n = 3;

        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        backTrack(arr,0,0,res,ans);
            Collections.sort(ans);
        System.out.print(ans);


    }
    public static void backTrack(int[] arr,int i,int sum,ArrayList<Integer> res,ArrayList<Integer> ans) {

        if (i == arr.length) {
            ans.add(sum);
            return;
        }
        res.add(arr[i]);
        backTrack(arr,i+1,sum+arr[i],res,ans);

        res.remove(res.get(res.size()-1));
        backTrack(arr,i+1,sum,res,ans);


    }
}
