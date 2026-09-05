import java.util.Arrays;

public class _01_SortArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 7, 4, 8, 9 };
        System.out.println("Your Array: " + Arrays.toString(arr));

        // sort function
        Arrays.sort(arr);

        System.out.println("Sorted Array:  " + Arrays.toString(arr));

    }
}
