package TCS_NumberSystem;

public class PowerExponentiation {
    static void main(String[] args) {
        int n = 21;
        int m = 2;
        int ans = 1;
        for(int i = 1; i<=m;i++){
            ans = ans * n;
        }
        System.out.println(ans);
    }
}
