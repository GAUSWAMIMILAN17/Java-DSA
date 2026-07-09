package TCS_String;

public class changeEachCharLowertoUpperAndUppertoLower {
    static void main(String[] args) {

        String s = "take u forward IS Awesome";

        // ❌ String ans = "";
        // ✅ Better: StringBuilder (O(n) instead of O(n²))
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // ✅ Space remains unchanged
            if (ch == ' ') {
                ans.append(' ');
            }

            // ❌ ch <= 91
            // ✅ Z = 90
            else if (ch >= 'A' && ch <= 'Z') {
                char a = (char) (ch + 32);
                ans.append(a);
            }

            // ✅ Check lowercase separately
            else if (ch >= 'a' && ch <= 'z') {
                char a = (char) (ch - 32);
                ans.append(a);
            }

            // ✅ Digits and special characters remain unchanged
            else {
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());
    }
}