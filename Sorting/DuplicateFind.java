import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class DuplicateFind {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // DuplicateFind obj = new DuplicateFind();
        // List<Integer> result = obj.findDuplicates(nums);
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }

    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                // int temp = arr[i];
                // arr[i] = arr[correctIndex];
                // arr[correctIndex] = temp;
                swap(arr, i, correctIndex);
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }

        }
        return ans;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
