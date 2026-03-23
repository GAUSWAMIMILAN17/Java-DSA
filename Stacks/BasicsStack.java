package Stacks;

import java.util.Stack;

public class BasicsStack {

    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
