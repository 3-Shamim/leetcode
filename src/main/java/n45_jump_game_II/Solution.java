package n45_jump_game_II;

class Solution {

    public int jump(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int group = 0;
        int max = 0;
        int jump = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = i + nums[i];

            if (sum > max) {
                max = sum;
            }

            if (i == group && i != nums.length - 1) {
                jump++;
                group = max;
            }

        }

        return jump;

    }

    public int jump2(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int[] visited = new int[nums.length];

        return recursion(nums, 0, 0, nums.length, visited);
    }

    private int recursion(int[] nums, int i, int jump, int minJump, int[] visited) {

        if (i >= nums.length - 1) {
            return jump;
        }

        if (visited[i] > 0) {
            return visited[i];
        }

        for (int j = nums[i]; j > 0; j--) {
            int _jump = recursion(nums, i + j, jump + 1, minJump, visited);
            if (minJump > _jump) {
                minJump = _jump;
            }
            visited[i] = _jump;
        }

        return minJump;
    }

}