package n80_remove_duplicates_from_sorted_array_II;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public int removeDuplicates(int[] nums) {

        int k = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count = 1;
                k++;
                nums[k - 1] = nums[i];
            } else if (count < 2) {
                count++;
                k++;
                nums[k - 1] = nums[i];
            }
        }

        return k;
    }

    public int removeDuplicates1(int[] nums) {

        List<Integer> values = new ArrayList<>();
        values.add(nums[0]);
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count = 1;
                values.add(nums[i]);
            } else if (count < 2) {
                values.add(nums[i]);
                count++;
            }
        }

        for (int i = 0; i < values.size(); i++) {
            nums[i] = values.get(i);
        }

        return values.size();
    }

}

