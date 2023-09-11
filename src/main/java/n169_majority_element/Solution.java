package n169_majority_element;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int element = nums[0];
        int startPoint = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

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

}

