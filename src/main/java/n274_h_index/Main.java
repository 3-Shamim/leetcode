package n274_h_index;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(solution.hIndex(new int[]{1, 3, 1}));
        System.out.println(solution.hIndex(new int[]{6}));
        System.out.println(solution.hIndex(new int[]{0}));
        System.out.println(solution.hIndex(new int[]{6, 6, 6, 6}));
        System.out.println(solution.hIndex(new int[]{6, 6, 6, 6, 6, 6}));
        System.out.println(solution.hIndex(new int[]{6, 6, 4, 5, 1, 1}));
        System.out.println(solution.hIndex(new int[]{1, 1, 1, 1, 1, 1, 2, 2}));
        System.out.println(solution.hIndex(new int[]{0, 0, 0, 0, 1, 1, 1, 2, 2}));

    }

}
