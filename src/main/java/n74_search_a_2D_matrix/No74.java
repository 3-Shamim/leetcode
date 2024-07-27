package n74_search_a_2D_matrix;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 27/7/24
 * Time: 8:30 PM
 * Email: mdshamim723@gmail.com
 */

public class No74 {

    // Binary Search
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int start = 0, end = matrix.length - 1;
        int colLen = matrix[0].length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > matrix[mid][colLen]) {
                start = mid + 1;
            } else if (target >= matrix[mid][0]) {
                return binarySearch(matrix[mid], target);
            } else {
                end = mid - 1;
            }

        }

        return false;
    }

    // Linear + Binary Search
    public static boolean searchMatrix1(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length) {

            if (target > matrix[row][col]) {
                row++;
            } else if (target >= matrix[row][0]) {

//                return linearSearch(matrix[row], target);
                return binarySearch(matrix[row], target);
            }

        }

        return false;
    }

    private static boolean linearSearch(int[] nums, int target) {

        for (int n : nums) {
            if (target == n) {
                return true;
            }
        }

        return false;
    }

    private static boolean binarySearch(int[] nums, int target) {

        int start = 0, end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 11));
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 60));
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 10));
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));

    }

}
