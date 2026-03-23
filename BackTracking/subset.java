package BackTracking;

public class subset {
    public static void Subsets(String a, String ans, int i){
        if(i==a.length()){
            System.out.println(ans);
            return;
        }
//        include
        Subsets(a,ans+a.charAt(i),i+1);
//        exclusion
        Subsets(a,ans,i+1);

    }
    static void main() {
        String a = "abc";
        String ans = "";
        Subsets(a,ans,0);

    }
}



