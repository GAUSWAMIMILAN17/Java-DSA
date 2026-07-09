package TCS_String;

public class removeAllVowels {
    static void main(String[] args) {
        String s =  "I am very happy today";
        String ans = "";

        for (int i =0; i< s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                continue;
            } else {
                ans += s.charAt(i);
            }
        }
        System.out.println( ans);
    }
}
