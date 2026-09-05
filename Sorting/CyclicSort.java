import java.util.Arrays;
// this work on only n numbers not work on repeating number

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 4, };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr) {
        int i = 0; // corrent index i zero se start hoga
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

    }

}
