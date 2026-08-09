package LinkedList;

public class CRUD_Operation {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void addMidle(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeLast() {
        if(head == null) {
            System.out.println("LL is Empty");
        }
        Node prev = head;
        while(prev.next.next != null){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        return val;
    }

    public int removeMiddle(int idx){
        if(head == null){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }

    public void Display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        CRUD_Operation ll = new CRUD_Operation();

        ll.addFirst(2);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addLast(7);
        ll.addMidle(10,2);
//        System.out.println(ll.removeLast());
//        System.out.println(ll.removeLast());
        System.out.println(ll.removeMiddle(2));
        ll.Display();


    }
}
