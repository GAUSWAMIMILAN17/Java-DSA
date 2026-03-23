package LinkedList;



public class implimentation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int count = 0;

        public void insertAtEnd(int data) {
            Node temp = new Node(data);

            if(head == null){
                head = temp;
            } else {
                tail.next = temp;

            }
            tail = temp;
            count++;
        }

        public void insertAtStart(int data) {
            Node temp = new Node(data);
            if(head == null){ //empty list
                head = temp;
                tail = temp;
            } else { //non empty list
                temp.next = head;
                head = temp;
            }
            count++;
        }
        public void insertAt(int idx, int data) {
            Node t = new Node(data);
            Node temp = head;
            if(idx == count){
                insertAtEnd(data);
                return;
            }
            if(idx == 0){
                insertAtStart(data);
                return;
            }
            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            count++;
        }
        int getAt(int idx){
            Node temp = head;
            if(idx < 0 || idx > count){
                System.out.println("Index out of bounds");
                return -1;
            }
            if(idx == 0){
                return temp.data;
            }
            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        public void deleteAt(int idx){
            Node temp = head;
            if (idx == 0){
                head = temp.next;
            }
            if(idx < 0 || idx > count){
                System.out.println("Index out of bounds");
            }
            for(int i = 1; i < idx; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == count - 1){
                tail = temp;
            }
            count--;
        }

        public boolean searchAt(int data) {
            Node temp = head;
            for(int i = 0; i < count; i++){
                if(temp.data == data){
                    return true;
                } else {
                    temp = temp.next;
                }
            }
            return false;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
//        int count (){
//            Node temp = head;
//            int count = 0;
//            while(temp != null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
//
//        }
    }
    static void main() {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(2);
//        ll.display();
//        System.out.println();
//        System.out.println(ll.count());
//        System.out.println();
        ll.insertAtEnd(4);
//        ll.display();
        ll.insertAtEnd(5);
//        ll.display();
        ll.insertAtStart(12);
//        ll.display();
        ll.insertAt(0,16);
        ll.insertAt(5,100);
        ll.display();
//        System.out.println(ll.head.data);
//        System.out.println(ll.tail.data);
//        System.out.println(ll.getAt(3));
//        System.out.println(ll.count);
//        ll.deleteAt(0);
//        ll.display();
//        System.out.println(ll.head.data);
//        System.out.println(ll.tail.data);

//        ll.searchAt(4);
        System.out.println(ll.searchAt(121));
    }
}
