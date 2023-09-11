package n169_majority_element;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{1, 1, 2};
        int k = solution.majorityElement(nums);
        System.out.println(k);

        nums = new int[]{3, 2, 3};
        k = solution.majorityElement(nums);
        System.out.println(k);

        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        k = solution.majorityElement(nums);
        System.out.println(k);


    }

}
