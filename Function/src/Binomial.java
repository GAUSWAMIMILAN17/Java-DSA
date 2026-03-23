package Function.src;

public class Binomial {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact= fact * i;
        }
        return fact;
    }

    public static int binomial(int n , int r){

        int factn = factorial(n);
        int factr = factorial(r);
        int factNmR = factorial( (n - r));

        int binomial = factn / (factr * (factNmR));
        return binomial;
    }

    public static void main(String args[]){

        int ans = binomial(5,3);
        System.out.println("Binomial is " + ans);


    }
}
