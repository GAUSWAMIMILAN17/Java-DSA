package Recursion;

public class binarystring {
    public static boolean printBinaryString(int n,int lastplace,String str){
        if (n==0){
            System.out.println(str);
            return true;
        }
        printBinaryString(n-1, 0,str+"0");
        if (lastplace==0){
            printBinaryString(n-1, 1,str+"1");
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(printBinaryString(3,0,""));
    }
}


