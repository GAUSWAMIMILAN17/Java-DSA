package TCS_String;

public class vowelsCount {
    static void main(String[] args) {
        String s = "India won the cricket match";
        int Vowels = 0;
        int Consonants = 0;
        int Whitespaces = 0;

        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i) == ' ') {
                Whitespaces++;
            } else if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                Vowels++;
            }
            else {
                Consonants++;
            }
        }

        System.out.println("Vowels : "+Vowels);
        System.out.println("Consonants : "+Consonants);
        System.out.println("Whitespaces : "+Whitespaces);

    }
}
