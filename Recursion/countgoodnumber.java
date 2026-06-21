package Recursion;

public class countgoodnumber {
    static void main() {
        int n = 4;
        int a = 5;
        System.out.println(count(a,n));
    }
    public static int count(int a, int n) {
        if(n==0) return 1;
        return a * count (a-1, n-1);
    }
}
