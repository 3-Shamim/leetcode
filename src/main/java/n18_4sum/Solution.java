package n18_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        int len = nums.length;

        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                for (int k = j + 1; k < len - 1; k++) {
                    for (int l = k + 1; l < len; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            System.out.printf("%d-%d-%d-%d\n", nums[i], nums[j], nums[k], nums[l]);
                        }
                    }
                }
            }
        }

        return new ArrayList<>();
    }

    public List<List<Integer>> fourSum1(int[] nums, int target) {

        Arrays.sort(nums);

        for (int s = 0; s < nums.length; s++) {

            int e = nums.length - 1;

            while (s + 1 < e - 1) {

            }

        }

        return new ArrayList<>();
    }

}