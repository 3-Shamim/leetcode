package n15_3sum;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));

        System.out.println(solution.threeSumClosest(new int[]{-1, 1, 1, -4}, 1));

        System.out.println(solution.threeSumClosest(new int[]{0, 0, 0}, 1));

    }

}
