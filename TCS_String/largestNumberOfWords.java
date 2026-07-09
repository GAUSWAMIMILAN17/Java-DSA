package TCS_String;

public class largestNumberOfWords {
    static void main(String[] args) {
        String s = "Doc abcdv";
        int max = 0;
        String largestWord = "";
        String[] words = s.split(" ");
        for (String word : words) {
            if(word.length()>max){
                largestWord="";
                max=word.length();
                largestWord+=word;
            }
        }
        System.out.println(largestWord);
    }
}
