public class CyclicSortMissingnum {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 3, 8 };
        cyclicSort(arr);
        findMissing(arr);
    }

    static void cyclicSort(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    static void findMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {

                System.out.println((i + 1) + " ");

            }

        }
    }
}
