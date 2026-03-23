package Function.src;

public class PrimeRange {

    public static void Prime(int n ){

        for (int i = 2 ; i<n ; i++){
            if (i ==2) System.out.print(" " + i );
            if (i%2==0) {
                 continue;}
            System.out.print(" " + i);
        }
    }
    public static void main(String args[]){
        Prime(20);

    }
}
