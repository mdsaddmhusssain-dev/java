public class AMaxInArray {
    public static void main(String[] args) {
        int[] arr = { 23, 5, 27, 8, 56 };
        System.out.print(max(arr, 1, 4));

    }

    static int max(int[] arr, int start, int end) {
        int maxval = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;

    }

}
