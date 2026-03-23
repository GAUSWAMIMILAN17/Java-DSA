package Array;

public class prefixsum {

    public static void printsubarray(int number[]){
        int ts=0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0]=number[0];
        for (int i = 1;i< prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;
            for (int j=i ; j<number.length; j++){
                int end = j;
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum>max) {
                    max = sum;

                }
            }
        }
        System.out.println("Sum of sub array max value is " + max);



    }
    public static void kadanes(int number[]){
        int Max = Integer.MIN_VALUE;
        int cs = 0;
        int ms = 0;
        for (int i=0; i< number.length;i++){
            cs=cs+number[i];
            if (cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max Numbe Is " + ms);
    }

    public static void main(String args[]){
        int number[] = {-2,-3,4,-1,-2,1,5,-3};

        kadanes(number);
    }
}
