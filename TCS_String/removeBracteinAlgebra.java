package TCS_String;

public class removeBracteinAlgebra {
    static void main(String[] args) {
        String s = "(((a-b))+c)";
        String ans = "";
//        tc=n^2 and sc=n
        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                continue;
            }
            ans += s.charAt(i);
        }
        System.out.println(ans);

//        tc=n and sc=n
        StringBuilder news = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                continue;
            }
            news.append(s.charAt(i));
        }

        System.out.println(news.toString());
    }
}
