package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class oneStacktoAnotherStack {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
//        Stack<Integer> rt=new Stack<>();
//        Stack<Integer> st1=new Stack<>();

        int n;
        System.out.println("Enter the element you want to insert");
        n = sc.nextInt();
        System.out.println("Enter the number of elements");
        for(int i=0;i<n;i++) {
            int x =sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

//        //reverse Order
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//
//        while(rt.size()>0){
//            st1.push(rt.pop());
//        }
//        System.out.println(st1);

        System.out.println("Bottom element insert");


        while(st.size()>0){
            st2.push(st.pop());
        }
        st.push(5);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
