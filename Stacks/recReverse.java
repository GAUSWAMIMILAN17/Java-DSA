package Stacks;

import java.util.Stack;

public class recReverse {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
//        display(st);
        st.push(5);
//        System.out.println(st);
        display(st);
    }
    // 1 2 3 4 5
    public static void display(Stack<Integer> st) {
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+ " ");
        display(st);
        st.push(top);
    }
}
