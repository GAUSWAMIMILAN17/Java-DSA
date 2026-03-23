package Sorting;

public class kthSmallestelement {

    // main function
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 3, 9, 1};
        int k = 2; // 2nd smallest

        int result = quickSelect(arr, 0, arr.length - 1, k);
        System.out.println(k + "nd smallest element = " + result);
    }

    // Quick Select function
    public static int quickSelect(int[] arr, int si, int ei, int k) {

        if (si <= ei) {

            int pivotIndex = partition(arr, si, ei);

            if (pivotIndex == k - 1) {
                return arr[pivotIndex];
            }
            else if (pivotIndex > k - 1) {
                return quickSelect(arr, si, pivotIndex - 1, k);
            }
            else {
                return quickSelect(arr, pivotIndex + 1, ei, k);
            }
        }
        return -1;
    }

    // Lomuto partition (swap method)
    public static int partition(int[] arr, int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }
}
