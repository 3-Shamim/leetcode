package Patters;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৮/৮/২৩
 * Time: ১০:১১ PM
 * Email: mdshamim723@gmail.com
 */

public class PatternTwo {

    public static void main(String[] args) {

        int n = 6;

        int mid = n / 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i <= mid && (j <= i || j > (n - i))) {
                    System.out.print(" * ");
                } else if (i >= mid && (j - (i - mid - 1) > mid || j + (i - mid - 1) <= mid)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }

            System.out.println();

        }

    }

}
