import java.util.Arrays;

public class RowColMatrix { //
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 },

        };
        System.out.println(Arrays.toString(search(matrix, 50)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1; // c not equal to M.l becoz if4x4 then index 0,1,2,3
        while (r < matrix.length && c >= 0) { // r<matrix.lentgh not = bcoz index start 0 to 3 of 4x4 if r=matrix.l then
                                              // condition false out of bound
            if (matrix[r][c] == target) { //
                return new int[] { r, c };
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }
        return new int[] { -1, -1 };

    }
}