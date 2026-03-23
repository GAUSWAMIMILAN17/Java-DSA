package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class removeConsicutiveSubsequences {

    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        RemoveSubsequence(str);
    }
    private static void RemoveSubsequence(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            if(stack.size()==0) {
                stack.push(ch);
            }
            else {
                if(ch == stack.peek()) {
                    stack.pop();

                }
                else {
                    stack.push(ch);
                }

            }
        }
        System.out.println(stack);
    }
}
