package Stacks;

import java.util.Stack;

public class removeBottom {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);

    }
    public static void display(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while(st.size()>1) {
            temp.push(st.pop());
//            display(st);
        }
        st.pop();
        while(temp.size()>0) {
            st.push(temp.pop());
//            display(st);
        }
        System.out.println(st);

    }
}
