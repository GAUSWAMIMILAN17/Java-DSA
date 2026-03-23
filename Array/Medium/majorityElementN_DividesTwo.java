package Array.Medium;

import java.util.HashMap;

public class majorityElementN_DividesTwo {

    static void main(String[] args) {
        int []arr={ 2,2,3,3,1,2,2};

        if(bruteForce(arr) != -1) {
            System.out.println(bruteForce(arr));
        } else {
            System.out.println("There is no majority element");
        }

        System.out.println("Using better solution " + betterSolution(arr));
    }

    public static int bruteForce(int[] arr){

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }

    public static int betterSolution(int[] arr){
        int n =  arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){

            if(!map.containsKey(num)){
                map.put(num,1);
            } else {
                map.put(num, map.get(num)+1);
            }
            if(map.get(num) > (n/2)){
                return num;
            }
        }
        return -1;
    }
}
