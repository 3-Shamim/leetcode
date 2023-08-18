package n11_container_with_most_water;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.printf("Expected: %d, Actual: %d\n", 49, solution.maxArea1(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.printf("Expected: %d, Actual: %d\n", 49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

        System.out.printf("Expected: %d, Actual: %d\n", 15, solution.maxArea1(new int[]{1, 8, 6, 2, 5}));
        System.out.printf("Expected: %d, Actual: %d\n", 15, solution.maxArea(new int[]{1, 8, 6, 2, 5}));

        System.out.printf("Expected: %d, Actual: %d\n", 1500, solution.maxArea1(new int[]{40, 10, 8, 100, 1, 2, 50, 44}));
        System.out.printf("Expected: %d, Actual: %d\n", 1500, solution.maxArea(new int[]{40, 10, 8, 100, 1, 2, 50, 44}));

        System.out.printf("Expected: %d, Actual: %d\n", 1, solution.maxArea1(new int[]{1, 1}));
        System.out.printf("Expected: %d, Actual: %d\n", 1, solution.maxArea(new int[]{1, 1}));

    }

}
