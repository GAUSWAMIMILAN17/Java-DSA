package Array;

public class revers {

    public static void revers( int num[]){
        int first = 0 , last= num.length-1;
        while(first<last){
            int swap = num[first];
            num[first] = num[last];
            num[last]=swap;
            first++;
            last--;


        }
    }

    public static void main(String args[]){
        int num[] = { 2,4,6,8,10};
        revers(num);

        for (int i = 0; i<num.length;i++){
            System.out.print(" " + num[i]);
        }
    }
}
