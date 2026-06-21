package Array;

import java.util.HashMap;
import java.util.Map;

public class elementOcuremoreThanNby2 {
    static void main(String[] args) {
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
//        System.out.println(Occure(arr));
//        System.out.println("Better Approach " + batterApproach(arr));
        System.out.println("Optimal Solution " + optimalApproach(arr));

    }

    public static int optimalApproach(int[] arr) {
        int count = 0;
        int el = 0;
        for (int num : arr){
            if(count ==0) {
                count = 1;
                el = num;
            } else if (num == el) {
                count++;
            }
            else {
                count--;
            }
        }
        int count1 = 0;
        for(int num:arr) {
            if(num == el) {
                count1++;
            }
        }

        if(count1 > arr.length/2) {
            return el;
        }

        return -1;
    }

    public static int batterApproach(int [] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1 );
            } else {
                map.put(arr[i], 1);
            }
        }
//        System.out.println(map.entrySet());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > arr.length / 2) {
                return entry.getKey();
            }
        }

        System.out.println(map);


        return -1;
    }
    public static int Occure(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j< arr.length; j++) {
                if(arr[j] == arr[i]) {
                    count++;
                }
            }
            if(count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }
}
