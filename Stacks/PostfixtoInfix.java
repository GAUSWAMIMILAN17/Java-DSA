package Stacks;

import java.util.Stack;

public class PostfixtoInfix {
    static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i = 0; i<postfix.length(); i++){
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii<= 57){
                String t = ""+ ch;
                val.push(t);
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                String o = "" + ch;
                String result = "(" + v1 + o + v2 + ")";
                val.push(result);

            }
        }
        System.out.println(val.peek());
    }
}

