package n27_remove_element;

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

}