package Stacks;


public class linklistImplementation {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }

    }

    public static class Stack {
        private Node head;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;

        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }

        boolean isEmpty(){
            if(size == 0){
                return true;
            }
            return false;
        }

    }
    static void main( String[] args ) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        System.out.println(st.size());
        st.push(4);
        st.display();
        System.out.println(st.size());
        st.push(5);
        st.display();
        System.out.println(st.size());
        st.push(6); // stack is full
        System.out.println(st.isEmpty());

    }
}
