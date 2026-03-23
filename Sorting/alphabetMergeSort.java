package Sorting;

public class alphabetMergeSort {

    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] sorted = mergesort(arr, 0, arr.length - 1);

        for (String s : sorted) {
            System.out.print(s + " ");
        }
    }

    public static String[] mergesort(String[] arr, int si, int ei) {
        if (si == ei) {
            return new String[]{arr[si]};
        }

        int mid = (si + ei) / 2;

        String[] left = mergesort(arr, si, mid);
        String[] right = mergesort(arr, mid + 1, ei);

        return merge(left, right);
    }

    public static String[] merge(String[] left, String[] right) {
        String[] temp = new String[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) < 0) {
                temp[k++] = left[i++];
            } else {
                temp[k++] = right[j++];
            }
        }

        while (i < left.length) {
            temp[k++] = left[i++];
        }

        while (j < right.length) {
            temp[k++] = right[j++];
        }

        return temp;
    }
}
