package n189_rotate_array;

class Solution {

    public void rotate(int[] nums, int k) {

        int len = nums.length;

        int[] temp = new int[len];

        System.arraycopy(nums, len - k, temp, 0, k);
        System.arraycopy(nums, 0, temp, k, len - k);
        System.arraycopy(temp, 0, nums, 0, len);

    }

    public void rotate2(int[] nums, int k) {

        int len = nums.length;

        int[] temp = new int[len];
        for (int i = len - k; i < len; i++) {
            temp[i - (len - k)] = nums[i];
        }
        for (int i = 0; i < len - k; i++) {
            temp[i + k] = nums[i];
        }

        for (int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotate1(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

}

