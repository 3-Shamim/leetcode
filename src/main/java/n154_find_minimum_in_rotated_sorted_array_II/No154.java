package n154_find_minimum_in_rotated_sorted_array_II;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 25/7/24
 * Time: 10:13 PM
 * Email: mdshamim723@gmail.com
 */

public class No154 {

    // Binary Search
    public static int findMin(int[] nums) {

        int start = 0, end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == nums[end] && nums[mid] == nums[start]) {
                end = end - 1;
                start = mid;
            } else if (nums[mid] <= nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return nums[start];
    }

    // Linear search find MIN
    public static int findMinLS1(int[] nums) {

        int min = nums[0];

        for (int num : nums) {

            if (num < min) {
                min = num;
            }

        }

        return min;
    }

    // Linear search
    public static int findMinLS(int[] nums) {

        int ans = nums[0];

        for (int num : nums) {

            if (ans > num) {
                return num;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
        System.out.println(findMin(new int[]{18, 11, 11, 13, 13, 15, 17}));
        System.out.println(findMin(new int[]{11, 11, 11}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 1}));
        System.out.println(findMin(new int[]{1, 3, 5}));
        System.out.println(findMin(new int[]{2, 2, 2, 0, 1}));
        System.out.println(findMin(new int[]{3, 3, 1, 3}));
        System.out.println(findMin(new int[]{1, 3, 3}));
        System.out.println(findMin(new int[]{10, 1, 10, 10, 10}));

    }

}
