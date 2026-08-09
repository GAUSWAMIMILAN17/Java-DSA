package TCS_NumberSystem;

import java.util.ArrayList;

public class PrimeFactor {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int N = 60;
        for(int i = 2; i< N; i++ ){
            if(N % i == 0) {
                if(isPrime(i)){
                    list.add(i);
                }
            }
        }
        System.out.println(list);

    }
    static boolean isPrime(int a){
        for(int i = 2; i< Math.sqrt(i); i++){
            if(a % i == 1){
                return true;
            }
        }
        return false;
    }
}
