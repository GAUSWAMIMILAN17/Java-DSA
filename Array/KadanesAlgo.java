package Array;

public class KadanesAlgo {

    static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = Integer.MIN_VALUE;

//        for(int i=0; i<arr.length; i++){
//            int sum = arr[i];
//            if (sum < 0) {
//                max = Math.max(max, sum);
//            } else {
//                for(int j =i+1; j< arr.length; j++) {
//                    max = Math.max(max , sum);
////                System.out.print(max + " ");
//                    sum += arr[j];
//                }
//            }
//        }
//        System.out.println();
//        System.out.println(max);

        int sum = 0;
        for(int num : arr) {
            sum += num;
            if (sum > max) {
                max = sum;
            } else {
                sum =0;
            }
        }
        System.out.println(sum);

    }
}
