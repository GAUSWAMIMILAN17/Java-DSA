package TCS_String;

public class frequecyCount {
    static void main(String[] args) {
        String s = "helloworld";

//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(int i = 0; i<s.length(); i++){
//            if(!map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),1);
//            } else {
//                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//            }
//        }
//        System.out.println(map);

//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//
//        int  ch = arr[0];
//        int count = 1;
//        for(int i = 0; i< arr.length; i++) {
//            if(ch == arr[i]){
//                count++;
//            } else {
//                System.out.println((char) ch + " " + count);
//                count=1;
//                ch = arr[i];
//            }
//        }

        int [] freq= new int[26];
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch- 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.print((char)(i + 'a') + "" + freq[i] + " ");
            }
        }

    }
}
