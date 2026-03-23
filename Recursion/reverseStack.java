package Recursion;

import java.util.Stack;

public class reverseStack {

    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(4);
        System.out.println(st);

        reverseStack(st);

        System.out.println(st);
    }
    static void reverseStack(Stack<Integer> st) {
        //4,1,3,2 => 2,3,1,4
    if(st.isEmpty()){
        return;
    }
    int top = st.pop();
    reverseStack(st);
    insertStack(st,top);


    }

    static void insertStack(Stack<Integer> st, int element) {
        if(st.isEmpty()){
            st.push(element);
            return;
        }
        int top = st.pop();
        insertStack(st,element);
        st.push(top);
    }
}
