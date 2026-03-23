package Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={10,20,1,4,90};
        int Smax = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                Smax = max;
                max = arr[i];
            }
            else if(arr[i] > Smax && arr[i] != max) {
                Smax = arr[i];
            }
        }
        System.out.println(Smax);

    }
}
