package Patters;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৮/৮/২৩
 * Time: ১০:১১ PM
 * Email: mdshamim723@gmail.com
 */

public class PatternOne {

    public static void main(String[] args) {

        int r = 4;
        int c = 5;

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("=======================================");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                if (i == 0 || i == (r - 1) || j == 0 || j == (c - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println("=======================================");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("=======================================");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < (c - i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("=======================================");

        for (int i = r; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("=======================================");

        for (int i = 0; i < r; i++) {

            for (int j = 1; j <= c; j++) {
                if (j > (c - 1 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println("=======================================");

        r = 5;

        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

        System.out.println("=======================================");

        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= i; j++) {

//                int sum = i + j;
//
//                if (sum % 2 == 0) {
//                    System.out.print(1);
//                } else {
//                    System.out.print(0);
//                }

                if (i % 2 == 0) {
                    System.out.print(j % 2 == 0 ? 1 : 0);
                } else {
                    System.out.print(j % 2 == 0 ? 0 : 1);
                }

            }
            System.out.println();

        }

    }

}
