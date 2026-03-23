package Recursion;

import java.util.Stack;

public class sortStack {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);

        stackSort(st);
        System.out.println(st);

    }
    static void stackSort(Stack<Integer> st) {

        // empty se k nai e check karvu
        if(st.isEmpty()){
            return;
        }

        //top element bahar kadho
        int top = st.pop();
        stackSort(st);

        //je element lidho hato and sachi jagya ma place kro
        inertStack(st,top); // ahiya badha pop element function ma pending hase and jyare ek function aakhu execut thase ena pasi j bija fns ne resume krse
    }

    static void inertStack(Stack<Integer> st, int element) {
        //case1. stack empty hase
        //OR top element elemnt karta nanno hoy
        // decending top element moto hovo joye

        if(st.isEmpty() || st.peek() < element){
            st.push(element);
            return;
        }

        // Case 2: Top mota hoy → pop kari ne niche javanu
        int top = st.pop();

        // Recursive call
        inertStack(st, element); // ahiye function return kri dese ena pasi nicheni line execute thase

        // Pacha je pop karyu hatu ene push karo
        st.push(top);
    }
}
