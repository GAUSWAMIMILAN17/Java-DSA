package TCS_String;

public class findTheNonRepeatingCharacter {
    static void main(String[] args) {
        String st = "Blockchain Technology";
        int n = st.length();
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0; i<s.length();i++){
//            if(!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i), 1);
//            } else {
//                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
//            }
//        }
//        for(Map.Entry<Character,Integer> pair : map.entrySet()){
//            if(pair.getValue() == 1) {
//                System.out.println(pair.getKey());
//            }
//        }

        int freq[] = new int[200];

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            if (st.charAt(i) == ' ')  // Ignoring spaces in the string
                continue;
            else
                // Incrementing each character's frequency
                freq[st.charAt(i) - 'a']++;
        }

        // Print non-repeating characters
        for (int i = 0; i < n; ++i) {
            if (freq[st.charAt(i) - 'a'] == 1 && st.charAt(i) != ' ') {
                // Output the non-repeating character
                System.out.print(st.charAt(i) + " ");
            }
        }
    }
}
