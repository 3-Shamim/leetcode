package n33_search_in_rotated_sorted_array;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 21/6/24
 * Time: 9:04 AM
 * Email: mdshamim723@gmail.com
 */

public class Solution {

    public int searchInsert(int[] nums, int target) {
//        return linearSearch(nums, target);
        return binarySearch(nums, target);
    }


    private int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return start;
    }


    private int linearSearch(int[] nums, int target) {

        int i;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }

        return i;
    }

}
