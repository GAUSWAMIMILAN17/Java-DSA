package Array;

public class pairs {

    public static void revers( int num[]){

        for (int i=0 ; i<num.length;i++){
            int cur = num[i];
            for (int j=i+1; j<num.length; j++){
                System.out.print("( " +cur+ ","+num[j]+")");
            }
            System.out.println();

        }




    }

    public static void main(String args[]){
        int num[] = { 2,4,6,8,10};
        revers(num);


    }
}
