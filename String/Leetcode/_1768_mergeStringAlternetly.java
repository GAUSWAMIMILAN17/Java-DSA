package String.Leetcode;

public class _1768_mergeStringAlternetly {
    static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqr";
        System.out.println(mergeAlternetly(str1, str2));

    }

    public static String mergeAlternetly(String str1, String str2){
        int i=0;
        int j=0;
        String ans="";
        while(i<str1.length()&&j<str2.length()){
            if(i<str1.length()){
                ans +=  str1.charAt(i);
                i++;
            }
            if(j<str2.length()){
                ans += str2.charAt(j);
                j++;
            }
        }
        while(i<str1.length()){
            ans += str1.charAt(i);
            i++;
        }
        while(j<str2.length()){
            ans += str2.charAt(j);
            j++;
        }
        return ans;
    }
}
