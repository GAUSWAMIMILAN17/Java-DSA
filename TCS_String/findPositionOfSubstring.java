package TCS_String;

public class findPositionOfSubstring {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "ll";

        int index = findIndex(str1, str2);

        System.out.println(index);
    }

    static int findIndex(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        // Try every possible starting position
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare characters
            while (j < m && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }

            // Entire substring matched
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}