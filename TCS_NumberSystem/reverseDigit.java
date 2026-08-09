package TCS_NumberSystem;

public class reverseDigit {
    static void main(String[] args) {
        int n = -8546;
        int sign = 1;
        int ans = 0;
        if(n < 0) {
            sign = -1;
            n = n * -1;
        }
        while(n>0){
            int ld = n % 10;
            ans = ans * 10 + ld;
            n = n / 10;
        }
        System.out.println(ans * sign);
    }
}
