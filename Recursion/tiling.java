package Recursion;

import javax.crypto.spec.PSource;

public class tiling {
    public static int tilingprob(int n){
        if (n==0 || n==1){
            return  1;
        }
        int fnm1 = tilingprob(n-1);

        int fnm2 = tilingprob(n-2);
        int totways = fnm1 + fnm2;
        return totways;

    }
    public static void main(String[] args) {
        System.out.println(tilingprob(3));
    }
}
