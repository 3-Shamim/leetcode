package n2022_convert_1d_array_into_2d_array;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

public class No2022 {

    public static int[][] construct2DArray(int[] original, int row, int col) {

        int[][] res = new int[row][col];

        int total = row * col;

        if (total != original.length) {
            return new int[0][0];
        }

        int r = 0;

        for (int i = 0; i < original.length; i++) {

            if (i != 0 && i % col == 0) {
                r++;
            }

            if (r >= row) {
                break;
            }

            res[r][i % col] = original[i];

        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2}, 1, 1)));

    }

}
