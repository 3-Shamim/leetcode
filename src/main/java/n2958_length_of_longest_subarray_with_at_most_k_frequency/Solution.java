package n2958_length_of_longest_subarray_with_at_most_k_frequency;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int maxSubarrayLength(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int max = 0;

        int left = 0;
        int right = 0;

        while (right < nums.length) {

            Integer count = countMap.get(nums[right]);

            count = count == null ? 1 : count + 1;

            while (count > k && left <= right) {

                if (nums[left] != nums[right]) {
                    countMap.put(nums[left], countMap.get(nums[left]) - 1);
                } else {
                    count = count - 1;
                }

                left++;
            }

            countMap.put(nums[right], count);

            if ((right - left + 1) > max) {
                max = right - left + 1;
            }

            right++;
        }

        return max;
    }

    public int maxSubarrayLength1(int[] nums, int k) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            Map<Integer, Integer> countMap = new HashMap<>();
            countMap.put(nums[i], 1);
            int current = 1;

            for (int j = i + 1; j < nums.length; j++) {

                Integer count = countMap.get(nums[j]);

                count = count == null ? 1 : count + 1;

                if (count > k) {
                    break;
                }

                countMap.put(nums[j], count);
                current++;

            }

            if (current > max) {
                max = current;
            }

        }

        return max;
    }

}