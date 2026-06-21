package BinerySearch;

public class nthroot {
    static void main(String[] args) {
        double x = 2;
                int n = -2;
        System.out.println(myPow(x,n));
    }

    public static double myPow(double x, int n) {
        if(n==0) return 1;
        else if (n < 0) {
             return 1 / myPow(x, -n);
        }
        return (double) x * myPow(x, n-1);
    }
}
