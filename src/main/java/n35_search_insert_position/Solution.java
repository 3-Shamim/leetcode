package n35_search_insert_position;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 21/6/24
 * Time: 9:04 AM
 * Email: mdshamim723@gmail.com
 */

public class Solution {

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] > nums[start] && (nums[mid] < target || nums[start] > target)) {
//                mid = start + 1;
//            } else if () {
//
//            }
//
//        }

        return 0;

//        return searchByLinearSearch(nums, target);

    }


    public int searchWithBinarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    /**
     * Time complexity O(n)
     */
    public int searchByLinearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
