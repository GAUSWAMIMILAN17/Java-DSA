package String.Leetcode;

public class _58_lengthOfLastWord {
    static void main(String[] args) {
        String str = "my name is milan ";
        System.out.println(IsLengthLastWord(str));
    }
    public static int IsLengthLastWord(String str1) {
        String str = str1.trim();
        int count = 0;
        for (int i = str.length()-1; i>=0; i--) {
            if(str.charAt(i)!=' ') count++;
            else break;
        }
        return count;
    }
}
