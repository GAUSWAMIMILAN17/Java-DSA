package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class removeBalancedBracket {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countBracket(str));
    }

    public static int countBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else {
                if (stack.size() == 0) {
                    return 0;
                }
                if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }
        if(stack.size() > 0){
            return stack.size();
        }
        return 0;
    }
}
