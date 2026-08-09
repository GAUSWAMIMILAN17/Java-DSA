package Queue;

public class linklistImplementation {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class queueLL {
        static Node head =  null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        void add(int val) {
            Node newNode = new Node(val);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        int remove() {
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.val;
            if(tail == head){
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

    }

    static void main() {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
