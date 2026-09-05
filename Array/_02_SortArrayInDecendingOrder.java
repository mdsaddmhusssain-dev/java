import java.util.Arrays;
import java.util.Collections;

public class _02_SortArrayInDecendingOrder {
    public static void main(String[] args) {
        Integer[] arr = { 1, 4, 2, 7, 4, 8, 9 };

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Decending order: " + Arrays.toString(arr));
    }

}
