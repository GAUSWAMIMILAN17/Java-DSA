package TCS_String;

public class wordCount {
    static void main(String[] args) {
        String s = "hello   world";
//        String[] words = s.split(" ");
//        System.out.println(words.length);
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        System.out.println(count);

    }
}
