package Sorting;

 class binarySearchMissingEle {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 4, 5, 6, 7};

        int low = 0;
        int high = arr.length - 1;
        int missing = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == mid) {
                low = mid + 1;
            } else {
                missing = mid;
                high = mid - 1;
            }
        }
        System.out.println(missing);
//        System.out.println("Missing Element = " + low);
    }
}
