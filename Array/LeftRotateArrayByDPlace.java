package Array;

public class LeftRotateArrayByDPlace {
    static void main(String[]args) {
        int []arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 2;

        int d2 = d % arr.length;
        int [] temp = new int[d2];

        for(int i=0;i<d2;i++){
            temp[i]=arr[i];
        }

        for(int i=d2; i<arr.length;i++){
            arr[i-d2]=arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[arr.length - d2 + i] = temp[i];
        }

        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
