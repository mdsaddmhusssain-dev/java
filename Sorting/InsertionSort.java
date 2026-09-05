public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 8, 2 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];

            }
            arr[j + 1] = key;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
