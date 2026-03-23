package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basic {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        System.out.println(q    );

//        => rear -> 5 4 3 2 1 -> front
        Queue<Integer> q2 = new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek() + " ");
            q2.add(q.poll());
        }
        while(q2.size()>0){
            q.add(q2.poll());
        }
    }
}
