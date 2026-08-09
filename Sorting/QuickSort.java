package Sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {6, 3, 9, 8, 2, 5};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int si, int ei) {

        if (si >= ei)
            return;

        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {

        int pivot = arr[si];

        int start = si;
        int end = ei;

        while (start < end) {

            while (start <= ei && arr[start] <= pivot) {
                start++;
            }

            while (end >= si && arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        int temp = arr[si];
        arr[si] = arr[end];
        arr[end] = temp;

        return end;
    }
}