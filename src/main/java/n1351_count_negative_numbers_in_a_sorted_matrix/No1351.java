package n1351_count_negative_numbers_in_a_sorted_matrix;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

public class No1351 {

    // Using binary search
    public static int countNegatives(int[][] grid) {

        int count = 0;

        if (grid == null || grid.length == 0) {
            return count;
        }

        int colLen = grid[0].length - 1;

        int row = 0, col = colLen;

        while (row < grid.length) {

             if (grid[row][col] >= 0) {

                count += colLen - col;

            } else {

                int pIn = binarySearch(grid[row], col);

                if (pIn == -1) {
                    count += (grid.length - row) * (colLen + 1);
                    break;
                } else {
                    count += colLen - pIn;
                    col = pIn;
                }

            }

            row++;

        }

        return count;
    }

    private static int binarySearch(int[] nums, int end) {

        int target = 0;
        int start = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return end;
    }

    // Two pointer approach O(m+n)
    public static int countNegativesTP(int[][] grid) {

        int count = 0;

        if (grid == null || grid.length == 0) {
            return count;
        }

        int row = 0, col = grid[0].length - 1;

        while (row < grid.length && col >= 0) {

            if (grid[row][col] < 0) {
                count += grid.length - row;
                col--;
            } else {
                row++;
            }

        }

        return count;
    }

    // Bruteforce O(n^2)
    public static int countNegativesBF(int[][] grid) {

        int count = 0;

        for (int[] row : grid) {

            for (int col : row) {

                if (col < 0) {
                    count++;
                }

            }

        }

        return count;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        System.out.println(countNegatives(matrix));

        int[][] matrix1 = {
                {4, 3, 1, -1},
                {3, 2, 1, -1},
                {1, 0, 0, -2},
                {-1, -1, -2, -3}
        };

        System.out.println(countNegatives(matrix1));

        int[][] matrix2 = {
                {3, 2},
                {-3, -3},
                {-3, -3},
                {-3, -3}
        };

        System.out.println(countNegatives(matrix2));

    }

}
