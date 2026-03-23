package Array_List;

import java.util.ArrayList;


public class Basic {

    public static void swap (ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

//        add o(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);

//        get o(1)
//        System.out.println(list.get(2));

//        remove o(n)
//        list.remove(2);
//        System.out.println(list);

//        remove(value) //boolean return kre
//        System.out.println(list.remove(Integer.valueOf(4)));
//        System.out.println(list);

//        set o(1)
//        list.set(2, 10);
//        System.out.println(list);

//        contains o(n) true or false value list ke andar hai ki nahi woh boolean return kre
//        System.out.println(list.contains(5));

//        if you don't specify class, you can put anything inside l
//        ArrayList l = new ArrayList<>();
//        l.add("press");
//        l.add(1);
//        l.add(true);
//        System.out.println(l);


//        System.out.println(list.size());
//    int max = 0;
//        for (int i=0; i<list.size(); i++){
//           System.out.print(list.get(i));
//            if(max<list.get(i)){
//                max = list.get(i);
//            }
//        }
//        System.out.println(max);

//        indexof()
//        it is used to return the index on this list of the first occurence of the specified ele or -1
//        System.out.println(list.indexOf(6));

//        lastindexof() [1,2,3,2,4] seli var 2 kya index par aavyo e jose => 3
        System.out.println(list.lastIndexOf(2));

//        int idx1 = 1; int idx2 = 3;
//        swap(list, idx1, idx2);


//        SHORTING AN ARRAYLIST
//        Collections.sort()
//
//        System.out.println("without sort" + list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println(list);
    }
}
