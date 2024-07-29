package n540_single_element_in_a_sorted_array;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 29/7/24
 * Time: 6:31 PM
 * Email: mdshamim723@gmail.com
 */

public class No540 {

    public static int singleNonDuplicate(int[] nums) {

        int len = nums.length;

        if (len == 1) {
            return nums[0];
        }

        int start = 0, end = nums.length - 1;

        while (start < end) {

            int mid = start + end >>> 1;

            if (nums[mid] == nums[mid + 1]) {

                if ((len - mid) % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid;
                }

            } else if (nums[mid] == nums[mid - 1]) {

                if ((len - mid - 1) % 2 == 0) {
                    end = mid - 2;
                } else {
                    start = mid + 1;
                }

            } else {
                return nums[mid];
            }

        }

        return nums[start];
    }

    public static int singleNonDuplicateLS(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] != nums[i] && (i == nums.length - 1 || nums[i] != nums[i + 1])) {
                return nums[i];
            }

        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(singleNonDuplicate(new int[]{1}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2}));
        System.out.println(singleNonDuplicate(new int[]{1, 2, 2}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        System.out.println(singleNonDuplicate(new int[]{3, 3, 7, 7, 10}));

    }

}
