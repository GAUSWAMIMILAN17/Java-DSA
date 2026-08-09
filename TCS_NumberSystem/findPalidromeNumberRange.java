package TCS_NumberSystem;

public class findPalidromeNumberRange {
    public static void main(String[] args) {
        int min = 100;
        int max = 150;

        for(int i = min; i<max; i++){
            if(palidromeCheck(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static boolean palidromeCheck(int i){
        int x = i;
        int reverse = 0;
        while(i>0){
            int ld = i % 10;
            reverse = reverse * 10 + ld;
            i = i / 10;
        }
        if(x == reverse) {
            return true;
        }
        return  false;
    }
}
