package Array_List;

import java.util.ArrayList;

public class Lonely {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(2);

        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int lonely1 =  list.get(i)-1;
            int lonely2 = list.get(i)+1;
            boolean found = false;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == lonely1 || list.get(j) == lonely2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                list2.add(list.get(i));
            }

        }
        System.out.println(list2);
    }
}
