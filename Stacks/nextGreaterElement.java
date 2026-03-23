package Stacks;

import java.util.Stack;

public class nextGreaterElement {

    static void main() {
        int [] arr = {1, 3, 2, 1, 8,6, 3, 4};
        nextGreatestElement(arr);
    }
    static void nextGreatestElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    break;
                }
            }
            if(max == arr[i]){
                stack.push(-1);
            }
            else{
                stack.push(max);
            }
        }
        System.out.println(stack);
    }
}
