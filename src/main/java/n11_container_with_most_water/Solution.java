package n11_container_with_most_water;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    /* Note:
     *  Brute force
     *  Time limit exceed in leetcode
     * */
    public int maxArea(int[] height) {

        int res = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                int minL = Math.min(height[i], height[j]);
                int width = j - i;

                int area = minL * width;

                if (area > res) {
                    res = area;
                }

            }

        }

        return res;
    }

    /* Note:
     *  Accepted in leetcode
     * */
    public int maxArea1(int[] height) {

        int res = 0;

        int i = 0;
        int j = height.length - 1;

        while (i != j) {

            int minL = Math.min(height[i], height[j]);
            int width = j - i;

            int area = minL * width;

            if (area > res) {
                res = area;
            }

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }

        }

        return res;
    }

}

