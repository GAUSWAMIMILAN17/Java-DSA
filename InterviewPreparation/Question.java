package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Question {


        public static void main (String[] args) {
            String word = "pqpqs";
            int k = 2;
            int count = AtMost(word,k) - AtMost(word,k-1);
            System.out.println(count);

        }

        public static int AtMost (String s, int k ) {
            int count =0;
            int right = 0; int left = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            while (right < s.length()) {
                char ch = s.charAt(right);
                map.put(ch , map.getOrDefault(ch, 0) +1);

                while(map.size() > k) {
                    char c = s.charAt(left);
                    map.put(c , map.get(c)-1);

                    if(map.get(c) == 0) {
                        map.remove(c);
                    }
                    left++;
                }


                count += right - left + 1;
                right ++;
            }
            return count;
        }

}