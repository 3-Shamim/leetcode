package n287_find_the_duplicate_number;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] data = {1, 3, 4, 2, 2};
        System.out.println(solution.findDuplicate(data));
        System.out.println(Arrays.toString(data));

        System.out.println(solution.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        System.out.println(solution.findDuplicate(new int[]{3, 3, 3, 3, 3}));

    }

}
