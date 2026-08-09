package TCS_NumberSystem;

public class primeGivenRange {
    static void main(String[] args) {
        int a = 10;
        int b = 17;

        for(int i = a; i<=b; i++){
            if(checkPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static boolean checkPrime(int n){
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
