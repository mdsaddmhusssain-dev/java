
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        int n = arr.length;
        // for n-1 times run
        for (int i = 0; i < n - 1; i++) {

            // for moves in each times
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap (arr[j] with arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }
}
