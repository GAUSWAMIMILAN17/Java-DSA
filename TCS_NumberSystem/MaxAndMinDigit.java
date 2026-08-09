package TCS_NumberSystem;

public interface MaxAndMinDigit {
    static void main(String[] args) {
        int n =27460;

        int max = 0;
        int min = 9;
        while(n>0){
            int ld = n % 10;
            if(ld > max){
                max = ld;
            } if(ld < min) {
                min = ld;
            }
            n = n / 10;
        }
        System.out.println(max+ " "+min);
    }
}
