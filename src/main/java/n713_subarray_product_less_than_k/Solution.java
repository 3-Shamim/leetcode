package n713_subarray_product_less_than_k;

class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int product = 1;
        int result = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            result += right - left + 1;
        }

        return result;


    }

    public int numSubarrayProductLessThanK2(int[] nums, int k) {

        return countSubArray(0, nums, k);
    }

    private int countSubArray(int index, int[] nums, int k) {

        int count = 0;

        if (index >= nums.length) {
            return count;
        }

        int product = nums[index];

        if (product < k) {
            count++;
        } else {
            return count;
        }

        for (int i = index + 1; i < nums.length; i++) {

            product *= nums[i];

            if (product < k) {
                count++;
            } else {
                break;
            }

        }


        return count + countSubArray(index + 1, nums, k);
    }

    public int numSubarrayProductLessThanK1(int[] nums, int k) {

        int product = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            product *= nums[i];

            if (product < k) {
                count++;
            } else {
                product = 1;
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                product *= nums[j];

                if (product < k) {
                    count++;
                } else {
                    break;
                }

            }

            product = 1;

        }

        return count;
    }

}