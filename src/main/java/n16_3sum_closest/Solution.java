package n16_3sum_closest;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            Set<Integer> sets = new HashSet<>();
            int c_sum = 0 - nums[i];

            for (int j = i + 1; j < nums.length; j++) {

                int t = c_sum - nums[j];

                if (sets.contains(t)) {

                    int low = Math.min(Math.min(nums[i], nums[j]), t);
                    int high = Math.max(Math.max(nums[i], nums[j]), t);

                    result.add(List.of(low, (nums[i] + nums[j] + t) - (low + high), high));
                }

                sets.add(nums[j]);

            }

        }

        return new ArrayList<>(result);

    }

    public List<List<Integer>> threeSum2(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums, 0, nums.length);

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] > 1) {
                break;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }

            }

        }

        return new ArrayList<>(result);

    }

    public List<List<Integer>> threeSum1(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {

                        int low = Math.min(Math.min(nums[i], nums[j]), nums[k]);
                        int high = Math.max(Math.max(nums[i], nums[j]), nums[k]);

                        int mid = sum - (low + high);

                        System.out.printf("Sorted %d, %d, %d\n", low, mid, high);

                        result.add(List.of(low, mid, high));

                    }

                }


            }

        }

        return new ArrayList<>(result);

    }

}

