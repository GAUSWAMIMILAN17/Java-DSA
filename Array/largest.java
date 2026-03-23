package Array;

public class largest {

    public static void larg(int Array[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0 ; i< Array.length ; i++){
            if (Array[i] > largest){
                largest = Array[i];

            }
            else continue;
        }
        System.out.println("Large Num Is " + largest);

    }
    public static void main(String args[]){
        int Array[] = { 2,3,45,12,85,20 };
        larg(Array);


    }
}
