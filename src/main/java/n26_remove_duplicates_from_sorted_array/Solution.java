package n26_remove_duplicates_from_sorted_array;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int removeDuplicates(int[] nums) {

        int k = 1;
        int s = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                k++;
                nums[s] = nums[i];
                s++;

            }

        }

        return k;
    }

    public int removeDuplicates1(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, num);
        }

        int k = map.size();

        int i = 0;
        for (Integer value : map.values()) {
            nums[i] = value;
            i++;
        }

        return k;
    }

    public int removeDuplicates2(int[] nums) {

        int k = 1;
        int[] data = new int[nums.length];
        data[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {

                k++;
                data[k - 1] = nums[i];

            }

        }

        System.arraycopy(data, 0, nums, 0, k);

        return k;
    }

}

