package n88_merge_sorted_array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int m = 3, n = 3;
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0}, nums2 = new int[]{2, 5, 6};
        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        m = 1;
        n = 0;

        nums1 = new int[]{1};
        nums2 = new int[0];

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        m = 0;
        n = 1;

        nums1 = new int[]{0};
        nums2 = new int[]{1};

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        m = 4;
        n = 4;

        nums1 = new int[]{1, 2, 3, 4, 0, 0, 0, 0};
        nums2 = new int[]{1, 2, 3, 4};

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        m = 4;
        n = 8;

        nums1 = new int[]{1, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0};
        nums2 = new int[]{2, 3, 4, 5, 6, 7, 8, 9};

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        m = 4;
        n = 5;

        nums1 = new int[]{1, 2, 3, 5, 0, 0, 0, 0, 0};
        nums2 = new int[]{2, 3, 4, 5, 6};

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        m = 8;
        n = 3;

        nums1 = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 0, 0, 0};
        nums2 = new int[]{4, 5, 6};

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        m = 4;
        n = 3;

        nums1 = new int[]{1, 2, 3, 5, 0, 0, 0};
        nums2 = new int[]{7, 8, 9};

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

}
