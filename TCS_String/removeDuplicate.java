package TCS_String;

import java.util.HashSet;

public class removeDuplicate {
    static void main(String[] args) {
        String s = "bcabc";
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i< s.length(); i++){
            set.add(s.charAt(i));
        }
        int i = 0;

            while(i<s.length()){
                if(set.isEmpty()){
                    break;
                }
                if(set.contains(s.charAt(i))){
                    sb.append(s.charAt(i));
                    set.remove(s.charAt(i));
                }
                i++;
            }

        System.out.println(sb.toString());
    }
}
