package Recursion;

import java.util.Stack;

public class generetBinery {
    static void main() {
        int n = 3;
        generetBinery("", n);
    }
    public static void generetBinery( String curr, int n) {

        if(curr.length() == n){
            System.out.println(curr);
            return;
        }
        generetBinery(curr + "0", n);
        if(curr.length() == 0 || curr.charAt(curr.length()-1) != '1'){
            generetBinery(curr + "1", n);
        }

    }

}
