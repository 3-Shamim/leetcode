package Sorts;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ২৬/৮/২৩
 * Time: ৩:১৭ PM
 * Email: mdshamim723@gmail.com
 */

public class Main {

    public static void main(String[] args) {

        Sort sort = new Sort();

        int[] a = new int[]{5, -1, 8, 4, 3, 4};

        sort.bubbleSort(a);

        System.out.println(Arrays.toString(a));

        int[] b = new int[]{5, -1, 8, 4, 3, 4};

        sort.selectionSort(b);

        System.out.println(Arrays.toString(b));

        int[] c = new int[]{5, -1, 8, 4, 3, 4};

        sort.selectionSort(c);

        System.out.println(Arrays.toString(c));


    }

}
