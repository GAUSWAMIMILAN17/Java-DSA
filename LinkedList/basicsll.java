package LinkedList;

public class basicsll {

    public static class Node{
        int data; //value
        Node next; //adress of next node

        Node (int data) {
            this.data = data;
        }
    }

    public static void main() {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        Node temp = a;
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(temp.data+ " ");
//            temp = temp.next;
//        }
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        display(a);
    }
    public static void display(Node head) {
        Node temp = head;
        int count =0;

        while (temp != null) {
            count++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println(count);
    }
}
