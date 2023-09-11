package n169_majority_element;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int majorityElement(int[] nums) {

        int element = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                element = num;
            }

            if (element == num) {
                count++;
            } else {
                count--;
            }

        }

        return element;
    }

    public int majorityElement1(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int element = 0;

        for (int num : nums) {

            int count = map.getOrDefault(num, 0) + 1;

            if (max < count) {
                max = count;
                element = num;
            }

            map.put(num, count);

        }

        return element;
    }

    public int majorityElement2(int[] nums) {

        Arrays.sort(nums);

        int element = nums[0];
        int lastCount = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                if (lastCount < count) {
                    lastCount = count;
                    element = nums[i - 1];
                }

                count = 1;
            } else {
                count++;
            }

        }

        if (lastCount < count) {
            element = nums[nums.length - 1];
        }

        return element;
    }

}

