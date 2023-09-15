package n55_jump_game;

class Solution {

    public boolean canJump(int[] nums) {

        if (nums.length == 1) {
            return true;
        } else if (nums[0] == 0) {
            return false;
        }

        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 0 && max <= i) {
                return false;
            }
            max = Math.max(i + nums[i], max);

        }

        return max >= nums.length - 1;

    }

}