package String.Leetcode;

public class _1021_outerParenthesis {
    static void main(String[] args) {
        String a = "(()())()()";
        String ans = "";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ')') count--;
            if(count != 0 ) {
                ans += a.charAt(i);
            }
            if(a.charAt(i) == '(') count++;
        }

        System.out.println(ans);
    }
}


// ans = ()()()()
