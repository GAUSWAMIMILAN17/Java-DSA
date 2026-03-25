package String.Leetcode;

public class isVowel {


        private static boolean checkIsVowel(char s1, char s2)
        {
            return isVowel(s1) && isVowel(s2);
        }
        private static boolean isVowel(char s)
        {
            return s=='a' || s=='e' || s=='i' || s=='o'|| s=='u';
        }
        private static int check(String [] words , int left , int right)
        {
            int count=0;
            for( int i=left ; i<=right; i++)
            {
                String temp = words[i];
                if(checkIsVowel(temp.charAt(0) , temp.charAt(temp.length()-1)))count++;
            }
            return count;
        }

        public static void main(String[] args) {
            String []words = {"are","amy","u"};
            int left = 0;
            int right=2;
            System.out.println(check(words,left, right));
        }

}
