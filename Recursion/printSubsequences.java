package Recursion;

import java.util.ArrayList;

public class printSubsequences {
    static void main() {
        ArrayList<Integer> arr =  new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        arr.add(4);
        arr.add(9);
        arr.add(2);
        arr.add(5);
        arr.add(1);

        printSubsequences(arr, 0, res);
//        System.out.println(arr);
    }

    public static void printSubsequences(ArrayList<Integer> arr, int i, ArrayList<Integer> res){

        if(i==arr.size()){
            System.out.println(res);
            return;
        }
        //pic
        res.add(arr.get(i));
        printSubsequences(arr,i+1,res);

        //backtrack
        res.remove(res.size()-1);
        //not pic
        printSubsequences(arr,i+1,res);
    }
}
