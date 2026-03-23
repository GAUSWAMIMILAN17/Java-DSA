package Array;

public class smallest {

    public static void small(int Array[]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0 ; i< Array.length ; i++){
            if (Array[i] < smallest){
                smallest = Array[i];

            }
            else continue;
        }
        System.out.println("Large Num Is " + smallest);

    }
    public static void main(String args[]){
        int Array[] = { 2,3,45,12,85,20 };
        small(Array);


    }
}

