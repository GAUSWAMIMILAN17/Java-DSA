package TCS_String;

public class palidromeornot {
    static void main(String[] args) {
            String str = "nurses run";
        System.out.println(palidrom(str));
        System.out.println(Palidrom(0,str));
    }
    public static String palidrom(String str) {
        int n = str.length()/2;
        str = str.replace(" ", "");
        System.out.println(str);
        for(int i=0; i< n; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return "not palidrom";
            }
        }
        return "palidrome";
    }

    public static boolean Palidrom(int i , String str) {

        int n = str.length()/2;
        str = str.replace(" ", "");
        if(i>=n) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;

        return Palidrom(i+1, str);
    }
}
