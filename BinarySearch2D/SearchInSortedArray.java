import java.util.Arrays;

public class SearchInSortedArray {

    static int[] searchInSortedArray(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int r = mid / col;
            int c = mid % col;

            if (matrix[r][c] == target) {
                return new int[] { r, c };

            }
            if (matrix[r][c] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        System.out.println(Arrays.toString(searchInSortedArray(matrix, 16)));
    }
}
