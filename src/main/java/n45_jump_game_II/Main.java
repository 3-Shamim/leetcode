package n45_jump_game_II;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{0}));
        System.out.println(solution.jump(new int[]{1}));
        System.out.println(solution.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(solution.jump(new int[]{2, 3, 0, 1, 4}));
        System.out.println(solution.jump(new int[]{3, 2, 2, 0, 4, 3, 2, 1}));
        System.out.println(solution.jump(new int[]{3, 2, 2, 0, 4, 3, 0, 2, 0, 1}));
        System.out.println(solution.jump(new int[]{1, 1, 1, 1, 0}));
        System.out.println(solution.jump(new int[]{2, 3, 1}));
        System.out.println(solution.jump(new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}));

    }

}
