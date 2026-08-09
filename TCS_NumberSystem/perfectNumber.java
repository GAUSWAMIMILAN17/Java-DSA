package TCS_NumberSystem;

public class perfectNumber {
    static void main(String[] args) {
        int n = 1;
        int sum = 0;
        for(int i=1; i< n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(n == 1 || n==0) {
            System.out.println("num if perfect");
        }
        else if(sum == n){
            System.out.println("num is perfect");
        } else{
            System.out.println("num is not perfect");
        }
    }
}
