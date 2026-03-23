package Array_List;

import java.util.ArrayList;

public class Monotonic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);

        System.out.println(list);

        System.out.println(isMonotonic(list));
    }

    public static boolean isMonotonic(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}