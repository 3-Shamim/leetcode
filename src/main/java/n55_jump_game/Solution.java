package n55_jump_game;

import java.util.Arrays;

class Solution {

    public boolean canJump(int[] nums) {

        if (nums.length == 1) {
            return true;
        } else if (nums[0] == 0) {
            return false;
        }

        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (max >= nums.length - 1) {
                return true;
            }

            if (nums[i] == 0 && max <= i) {
                return false;
            }
            max = Math.max(i + nums[i], max);

        }

        return max >= nums.length - 1;

    }

    public boolean canJump1(int[] nums) {

        if (nums.length == 1) {
            return true;
        } else if (nums[0] == 0) {
            return false;
        }

        boolean match = Arrays.stream(nums).anyMatch(v -> v == 0);

        if (!match) {
            return true;
        }

        int[] visited = new int[nums.length];

        return recursion(nums, 0, visited);
    }

    private boolean recursion(int[] nums, int i, int[] visited) {

        if (i >= nums.length - 1) {
            return true;
        }

        if (visited[i] == 1 || nums[i] == 0) {
            return false;
        }

        visited[i] = 1;

        for (int j = nums[i]; j > 0; j--) {

            boolean recursion = recursion(nums, i + j, visited);

            if (recursion) {
                return true;
            }

        }

        return false;
    }

    private boolean recursion1(int[] nums, int i) {

        if (i == nums.length - 1) {
            return true;
        }

        if (nums[i] == 0) {
            return false;
        }

        for (int j = 1; j <= nums[i]; j++) {

            boolean recursion = recursion1(nums, i + j);

            if (recursion) {
                return true;
            }

        }

        return false;
    }

}