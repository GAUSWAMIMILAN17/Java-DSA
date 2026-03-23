package Array.Medium;

public class maxSubArraySum {
    static void main(String[] args) {
        int [] arr ={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(brutForce(arr));
        System.out.println(optimal(arr));
    }

    public static int optimal(int[] arr){
        int sum = 0;
        int max =  Integer.MIN_VALUE;
        for (int num : arr) {
            sum += num;
            max =  Math.max(max, sum);

            if (sum < 0)
                sum = 0;
        }
        return max;
    }

    public static int brutForce(int []arr)
    {
        int max = Integer.MIN_VALUE; //  taking the minimum value as much as possible

        for( int i=0; i<arr.length; i++)
        {
            for(int j=i ; j<arr.length; j++)
            {
                int sum =0 ;
                //iterating the in the i to j sub array
                for( int k = i; k<j; k++)
                {
                    sum+=arr[k];
                    max = Math.max(sum , max);
                }
            }
        }
        return max;
    }
}
