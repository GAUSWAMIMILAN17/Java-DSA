package Array_List;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(10);

        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sort Asc" +list);;
        Collections.reverse(list);
        System.out.println("Sort dec" + list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("Reverse Desc" +list);
    }
}
