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

        System.out.println("======================================================");

        n = 5;
        int col = ((n - 2) * 2 + 3);

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= col; j++) {

                if ((j <= n - i) || ((col + 1) - i) < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();

        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println("======================================================");

        n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%s ", i);
            }

            System.out.println();

        }

        System.out.println("======================================================");

        n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + i + 1; j++) {
                System.out.print((i + 1) - j > 0 ? (i + 1) - j : (j-i) + 1);
            }

            System.out.println();

        }


    }

}
