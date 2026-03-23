package Array;

public class subarray {

    public static void printsubarray(int number[]){
        int ts=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            int start = i;
            for (int j=i ; j<number.length; j++){
                int end = j;
                int sum = 0;
                for( int k=start; k<=end;k++){
//                    int sum = 0;
                    System.out.print(number[k]+ " ");
                    sum = sum + number[k];
                }
                System.out.println("sum of array " +sum);
                ts++;
//                int max = Integer.MIN_VALUE;
                if (sum>max){
                    max = sum;
                }
                if (sum<min){
                    min = sum;
                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total subarrays = " + ts);
        System.out.println("Sum of sub array max value is " + max);
        System.out.println("Sum of sub array min value is " + min);
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10};

        printsubarray(number);
    }
}
