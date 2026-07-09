package TCS_String;

public class reverseWord {
    static void main(String[] args) {
        String s = "welcome to the jungle";
        StringBuilder n = new StringBuilder(s);
        n.reverse();
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        int i = 0;
        while(i<n.length()){
            if(n.charAt(i) != ' ' || i == n.length()-1){
                word.append(n.charAt(i));
                i++;
            } else {
                word.reverse();
                ans.append(" " + word);
                word.setLength(0);
                i++;
            }
        }
        word.reverse();
        ans.append(" " + word);
        System.out.println(ans.toString().trim());
    }
}
