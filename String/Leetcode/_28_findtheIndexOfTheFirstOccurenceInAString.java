package String.Leetcode;

public class _28_findtheIndexOfTheFirstOccurenceInAString {

    static void main(String[] args) {
        String str1 = "gauswamimilan";
        String str2 = "milan";

        System.out.println(firstIndexOfOccurence(str1, str2));
    }

    public static int firstIndexOfOccurence(String str1, String str2) {

        for (int i = 0; i <= str1.length()-str2.length()+1; i++) {
            if(str1.charAt(i)==str2.charAt(0)){
                if(str1.substring(i, str2.length()+i).equals(str2)){
                    return i;
                }
            }
        }
        return -1;

    }
}
