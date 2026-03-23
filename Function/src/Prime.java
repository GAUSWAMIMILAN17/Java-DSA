package Function.src;

public class Prime {


    public static boolean Prime(int n){
//        boolean NumPrime = true;
        for (int i = 2 ; i<n ; i++){
            if (n%i==0)
                return false;

        }
        return true;
    }

    public static void main(String args[]){
        boolean Ans = Prime(3);
        System.out.println("My Num Is " + Ans);



    }
}
