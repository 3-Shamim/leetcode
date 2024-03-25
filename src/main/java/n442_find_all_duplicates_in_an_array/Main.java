package n442_find_all_duplicates_in_an_array;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(solution.findDuplicates(new int[]{1, 1, 2}));
        System.out.println(solution.findDuplicates(new int[]{1}));

    }

}
