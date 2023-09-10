package n27_remove_element;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public int removeElement(int[] nums, int val) {

        int k = 0;

        int lastIndex = nums.length;

        for (int i = 0; i < lastIndex; i++) {

            if (nums[i] == val) {

                while (--lastIndex > i && nums[lastIndex] == val) {
                    k++;
                }

                nums[i] = nums[lastIndex];
                nums[lastIndex] = val;
                k++;
            }

        }

        return nums.length - k;
    }

    public int removeElement1(int[] nums, int val) {

        int k = 0;

        int lastIndex = nums.length;

        for (int i = 0; i < lastIndex; i++) {

            if (nums[i] == val) {

                while (true) {
                    if (i >= --lastIndex) {
                        break;
                    }
                    if (nums[lastIndex] != val) {
                        break;
                    }
                    k++;
                }

                nums[i] = nums[lastIndex];
                nums[lastIndex] = val;
                k++;
            }

        }

        return nums.length - k;
    }

    public int removeElement2(int[] nums, int val) {

        List<Integer> unique = new ArrayList<>();

        for (int num : nums) {

            if (num != val) {
                unique.add(num);
            }
        }

        for (int i = 0; i < unique.size(); i++) {
            nums[i] = unique.get(i);
        }

        return unique.size();
    }

}