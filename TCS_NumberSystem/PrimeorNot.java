package TCS_NumberSystem;

public class PrimeorNot {
    static void main(String[] args) {
        System.out.println(CheckPrime(10));
    }

    public static boolean CheckPrime(int N) {
        int count = 0;
        for (int i = 2; i<= Math.sqrt(N); i++) {
            if(N % i == 0){
                return false;
            }
        }
        return true;
    }
}
