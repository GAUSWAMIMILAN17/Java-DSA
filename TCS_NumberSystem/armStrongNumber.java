package TCS_NumberSystem;

public class armStrongNumber {
    static void main(String[] args) {
        int n = 123;
        int originalNumber = n;
        int temp = n;
        int count = 0;

        while(temp > 0)
        {
            temp = temp / 10;
            count++;
        }
        System.out.println(armStrong(n, originalNumber, count));
//        System.out.println(power(2,5));
    }

    static boolean armStrong(int n, int origNum, int count){
        int ans = 0;

        while(n > 0) {
            int ld = n % 10;
            ans = ans + power(ld , count);
            n = n / 10;

        }
        if(ans == origNum) return true;
        return false;

    }

    static int power(int ld, int count) {
        if(count == 1) {
            return ld;
        }
        return ld * power(ld, count-1);
    }
}
