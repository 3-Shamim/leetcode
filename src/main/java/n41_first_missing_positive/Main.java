package n41_first_missing_positive;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.firstMissingPositive(new int[]{1, 2, 0}));

        System.out.println(solution.firstMissingPositive(new int[]{3, 4, -1, 1}));

        System.out.println(solution.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));

        System.out.println(solution.firstMissingPositive(new int[]{0}));

        System.out.println(solution.firstMissingPositive(new int[]{-5}));

    }

}
