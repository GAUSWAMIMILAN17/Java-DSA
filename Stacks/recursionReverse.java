package Stacks;

import java.util.Stack;

public class recursionReverse {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        if(st.size()==1) {
            return;
        }
        int Top = st.pop();
        reverse(st);
        pushatBottom(st,Top);

    }
    public static void pushatBottom(Stack<Integer> st, int x) {
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int Top = st.pop();
        pushatBottom(st,x);
        st.push(Top);

    }
}
