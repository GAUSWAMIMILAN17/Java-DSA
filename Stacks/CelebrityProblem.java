package Stacks;

import java.util.Stack;

public class CelebrityProblem {
    static void main(String[] args) {
        int[][] arr = {{0,1,0},{0,0,0},{0,1,0}};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++){
            st.push(i);
        }
        int result = Celebrity(st,arr);
        System.out.println(result);
    }

    public static int Celebrity(Stack<Integer> st, int[][] arr){
        int n =arr.length;
        while (st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();

            if(arr[v1][v2] == 0) {  //chanch become v1 is celebrity
                st.push(v1);
            } else if (arr[v2][v1] == 0) { //chanch become v2 is celebraty
                st.push(v2);
            }
        }

        if(st.size() == 0) {
            return -1;
        }
        int potential = st.pop();
        for(int i=0; i< n; i++){
            if(arr[potential][i] == 1) return -1;
        }
        for(int i =0; i<n; i++){
            if(i == potential) continue;
            if(arr[i][potential] == 0) return -1;
        }
        return potential;

    }
}
