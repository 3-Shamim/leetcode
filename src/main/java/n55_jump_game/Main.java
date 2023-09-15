package n55_jump_game;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{0}));
        System.out.println(solution.canJump(new int[]{1}));
        System.out.println(solution.canJump(new int[]{0, 3, 1, 1, 4}));
        System.out.println(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(solution.canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(solution.canJump(new int[]{3, 2, 1, 0, 4, 8, 10}));
        System.out.println(solution.canJump(new int[]{3, 2, 2, 0, 4, 3, 2, 1}));
        System.out.println(solution.canJump(new int[]{3, 2, 2, 0, 4, 3, 2, 1, 0}));
        System.out.println(solution.canJump(new int[]{3, 2, 2, 0, 4, 3, 2, 1, 0, 2}));
        System.out.println(solution.canJump(new int[]{1, 1, 1, 1, 0}));
        System.out.println(solution.canJump(new int[]{1, 3, 1, 1, 4}));
        System.out.println(solution.canJump(new int[]{3, 2, 0, 1, 4}));
        System.out.println(solution.canJump(new int[]{5, 0, 0, 6, 0, 0, 4, 0, 0, 0, 4}));

    }

}
