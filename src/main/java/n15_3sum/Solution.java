package n15_3sum;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        for (int i = 0; i < nums.length - 3; i++) {

            for (int j = i; j < nums.length - 2; j++) {

                System.out.print(nums[j]);
                System.out.print(nums[j + 1]);
                System.out.print(nums[j + 2]);
                System.out.println();

            }

        }

        return null;

    }

}

