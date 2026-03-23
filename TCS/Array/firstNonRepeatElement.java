package TCS.Array;

public class firstNonRepeatElement {

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 0, 3};

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            boolean isRepeat = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == x) {
                    isRepeat = true;
                    break;
                }
            }

            if (!isRepeat) {
                System.out.println("First Non Repeating Element: " + arr[i]);
                break;
            }
        }
    }
}