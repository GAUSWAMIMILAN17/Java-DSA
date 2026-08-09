package Stacks;

import java.util.Stack;

public class PrefixtoInfix {
    static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i = prefix.length()-1; i>=0; i--){
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii<= 57){
                String t = ""+ ch;
                val.push(t);
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                String o = "" + ch;
                String result = "(" + v1 + o + v2 + ")";
                val.push(result);

            }
        }
        System.out.println(val.peek());
    }
}

