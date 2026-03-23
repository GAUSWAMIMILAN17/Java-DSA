package Sorting;

//Hoare Sorting
public class quicksort2 {

    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si < ei) {
            int pIndex = pivot(arr, si, ei);
            quicksort(arr, si, pIndex);
            quicksort(arr, pIndex + 1, ei);
        }
    }

    // ✅ Proper Hoare Partition
    public static int pivot(int arr[], int si, int ei) {
        int pivot = arr[si];
        int i = si - 1;
        int j = ei + 1;

        while (true) {

            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
