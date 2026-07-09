package TCS_String;

public class changeEveryLetterInNextLexicoGraphical {
    static void main(String[] args) {
//        String s = "abcdxyz";
//        String ans = "";
//
//        for(int i = 0; i< s.length(); i++){
//            if(s.charAt(i) == 'z') {
//                ans += 'a';
//            } else {
//                char ch = (char)((int)s.charAt(i) + 1);
//                ans += ch;
//            }
//        }
//        System.out.println(ans);

        String s = "abcdxyz";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'z') {
                sb.append('a');
            } else {
                sb.append((char) (ch + 1));
            }
        }

        System.out.println(sb.toString());
    }
    }

