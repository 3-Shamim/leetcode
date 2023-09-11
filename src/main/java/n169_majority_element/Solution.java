package n169_majority_element;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int majorityElement(int[] nums) {

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

