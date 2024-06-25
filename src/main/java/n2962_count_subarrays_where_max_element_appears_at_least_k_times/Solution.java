package n2962_count_subarrays_where_max_element_appears_at_least_k_times;

class Solution {

    public long countSubarrays(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        System.out.println(min);
        System.out.println(max);

        return 0;
    }

}