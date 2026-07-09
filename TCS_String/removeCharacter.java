package TCS_String;

public class removeCharacter {
    static void main(String[] args) {
        String s = "Java&C++";
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i)<='z' || s.charAt(i) >= 'A' && s.charAt(i)<='Z'){
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
