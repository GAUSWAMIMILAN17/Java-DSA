package Array;

import java.util.Arrays;

public class moveAllZeroToEnd {
    static void main(String[] args) {
        int []arr ={1,0,2,0,3,0,3,4,5};
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index++]=arr[i];
            }
        }
        for(int j=index;j<arr.length;j++){
            arr[j]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
