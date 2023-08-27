package n15_3sum;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public int threeSumClosest(int[] nums, int target) {

        int diff = Integer.MAX_VALUE;
        int closest = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                int d = Math.abs(target - sum);

                if (diff > d) {
                    diff = d;
                    closest = sum;
                }

                if (d == 0) {
                    return sum;
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }

            }

        }

        return closest;
    }

}

