package LinkedList;

import java.util.HashMap;

public class lengthofloop {

    public static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }

     static void main() {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(5);
        Node f = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = c;

        //2 -> 3 -> 4 -> 5 -> 6 -> 7
//                  |--------------|
         System.out.println(lengthLoop(a));

    }

    public static int lengthLoop(Node head) {
        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int index = 0;

        while (temp != null) {

            // loop detected
            if (map.containsKey(temp)) {
                return index;
            }

            map.put(temp, index);
            index++;
            temp = temp.next;
        }

        // no loop
        return 0;
    }
}
