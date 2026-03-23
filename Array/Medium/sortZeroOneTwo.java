package Array.Medium;

public class sortZeroOneTwo {
    static void main(String[] args) {
        int []arr= {0,1,2,0,1,2,0,1,0,0,0,1};
        int zero=0;
        int one=0;
        int two=0;
        for(int num : arr) {
            if(num==0) {
                zero++;
            }
            else if(num==1) {
                one++;
            }
            else two++;
        }

        for (int i=0; i<zero; i++) {
            arr[i]=0;
        }
        for (int i=zero; i<(zero+one); i++) {
            arr[i]=1;
        }
        for (int i=(one+zero); i<arr.length; i++) {
            arr[i]=2;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
