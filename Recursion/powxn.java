package Recursion;

public class powxn {
    static void main() {
        double x = 2 ;
        int n = -2;

        System.out.println(pow(x,n));
    }

    public static double pow(double x , int n) {

        if (n==0) return 1;
        if(n < 0) return 1 / x * pow(x , n+1);

        return (double)x * pow(x, n-1);

    }
}
