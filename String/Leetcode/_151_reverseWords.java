package String.Leetcode;

public class _151_reverseWords {
    static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuilder rev = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        rev.append(s);
        System.out.println(rev);
        rev.reverse();
        System.out.println(rev);

        for(int i=0; i<rev.length(); i++){
            StringBuilder word = new StringBuilder();
            while(i<rev.length() && rev.charAt(i) != ' '){
                word.append(rev.charAt(i));
                i++;
            }
            word.reverse();

            if(word.length()>0){
                ans.append(" "+word);
            }
        }
        System.out.print(ans.toString().trim());
    }
}
