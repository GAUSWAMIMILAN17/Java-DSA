package TCS_NumberSystem;

public class Permutation {

    public static void main(String[] args) {

        int n = 3;
        int r = 5;

        if (r > n) {
            System.out.println(0);
            return;
        }

        int ans = factorial(n) / factorial(n - r);

        System.out.println(ans);
    }

    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}