package TCS_String;

public class reverseString {
    static void main(String[] args) {
//        String s = "I am iron man";
        String s = "this sky is beutiful";
        StringBuilder newS = new StringBuilder(s);
        newS.reverse();
        System.out.println(newS);
        System.out.println(reverse(newS.toString()));
    }

    public static String reverse(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int i = 0 ;
        while(i <s.length()) {
            if(s.charAt(i)== ' ') {
                word.reverse();
                ans.append(" " + word);
                word.setLength(0);
                i++;
            } else {
                word.append(s.charAt(i));
                i++;
            }
        }
        if(i == s.length()) {
            word.reverse();
            ans.append(" " + word);
        }
        return ans.toString().trim();
    }
}
