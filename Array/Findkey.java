package Array;

public class Findkey {

    public static int find(int Array[],int key){

        for (int i = 1 ; i<= 6 ; i++){
            if (Array[i]==key){
                return i;
            }

        }
       return -1;
    }
    public static void main(String args[]){
     int Array[] = { 2 , 3 , 5 , 10 , 12 , 16};
     int key = 10;
     int Number = find(Array , key);
     System.out.println(Number + " ");
    }
}
