package n27_remove_element;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{3, 2, 2, 3};
        int k = solution.removeElement(nums, 3);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{3, 2, 2, 3, 2, 2};
        k = solution.removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2, 2, 2, 2, 2};
        k = solution.removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2};
        k = solution.removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{3};
        k = solution.removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2, 3};
        k = solution.removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{3, 2};
        k = solution.removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        k = solution.removeElement(nums, 2);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));

    }

}
