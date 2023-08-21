package n15_3sum;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = i; j < nums.length - 2; j++) {

                System.out.printf("Actual %d, %d, %d\n", nums[i], nums[j + 1], nums[j + 2]);

//                int sum = (nums[i] + nums[j + 1] + nums[j + 2]);
//
//                System.out.println(sum);

//                if (sum == 0) {
//
//                    int low = Math.min(Math.min(nums[i], nums[j + 1]), nums[j + 2]);
//                    int high = Math.max(Math.max(nums[i], nums[j + 1]), nums[j + 2]);
//
//                    int mid = sum - (low + high);
//
//                    System.out.printf("Sorted %d, %d, %d\n", low, mid, high);
//
//                }

            }

        }

        return null;

    }

}

