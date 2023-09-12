package n189_rotate_array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1, -100, 3, 99};
        solution.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1};
        solution.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1,2};
        solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

    }

}
