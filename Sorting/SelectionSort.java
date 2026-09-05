import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 8, 2, 7 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        // for move i
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                    flag = true;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            if (flag == false) {
                break;
            }
            System.out.println(i);
        }
    }

}
