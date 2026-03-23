package Array_List;

import java.util.ArrayList;

public class FrequentNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {  // ✔️ correct condition
                if (list.get(i).equals(list.get(j))) {  // ✔️ equals() use for Integer
                    System.out.println("Repeated: " + list.get(i));
                }
            }
        }
    }
}
