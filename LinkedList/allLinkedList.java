package LinkedList;

public class allLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int count = 0;

        public void insertAtStart(int data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
                tail = temp;
            } else {
            temp.next = head; }
            head = temp;
            count++;
        }
        public void insertAtEnd(int  data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            count++;
        }
        public void insertMiddle(int idx, int data) {
            Node t = new Node(data);
            Node temp = head;
            if(idx == count) {
                insertAtEnd(data);
                return;
            }
            if(idx == 0) {
                insertAtStart(data);
                return;
            }
            for(int i = 1; i< idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            count++;
        }

        public void display() {
            Node temp = head;
            int i = 0;
            while (temp != null && i < count) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
                i++;
            }
            System.out.println();
        }
        public void deleteAt(int idx){
            Node temp = head;
            if(idx == 0){
                head = temp.next;
            }
            if(idx < 0 || idx >= count) {
                System.out.println("out of bound");
            }
            for(int i=1; i< idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == count-1){
                tail = temp;
            }
            count--;
        }

        public boolean searchAt(int data) {
            Node temp = head;
            for(int i=1; i<count; i++) {
                if(temp.data == data){
                    return true;
                } else {
                    temp = temp.next;
                }
            }

            return false;
        }

        static void main(String[] args) {
            linkedlist ll = new linkedlist();

            ll.insertAtStart(2);
            ll.insertAtStart(3);
            ll.insertAtStart(5);
            ll.insertAtEnd(10);
            ll.insertMiddle(1,15);
//            ll.deleteAt(5);
            System.out.println(ll.searchAt(100));
            ll.display();
        }
    }
}
