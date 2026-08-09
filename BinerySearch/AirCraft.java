package BinerySearch;

import java.util.Arrays;

public class AirCraft {
    static int minimumAircrafts(int[] weights,int capacity){
        if(weights.length==0) return 0;

        for(int w:weights)
            if(w>capacity) return -1;

        Arrays.sort(weights);

        int left=0,right=weights.length-1;
        int aircrafts=0;

        while(left<=right){
            if(left==right){
                aircrafts++;
                break;
            }
            if(weights[left]+weights[right]<=capacity)
                left++;
            right--;
            aircrafts++;
        }
        return aircrafts;
    }
}
