package Function.src;

public class OptimisedPrime {

    public static boolean Prime(int n){
        for (int i = 1 ; i< Math.sqrt(n) ; i++){
            if ( n%i==0)
                return false;
            break;

        }
        return true;
    }

    public static void main(String atrgs[]){
        boolean Ans = Prime(6);
        System.out.println("My Num Is " + Ans);

    }
}
