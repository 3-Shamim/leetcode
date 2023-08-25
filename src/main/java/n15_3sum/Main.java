package n15_3sum;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

        System.out.println(solution.threeSum(new int[]{-2, 0, 1, 1, 2})); // [[-2,0,2],[-2,1,1]]

    }

}
