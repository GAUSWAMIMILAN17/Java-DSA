package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
//        list.add(100);

        int i= 0;
        int j=list.size()-1;
        while(i<j) {

            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println("Reversed use Collections" +list);
    }
}
