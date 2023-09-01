package recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৩০/৮/২৩
 * Time: ৯:৫২ PM
 * Email: mdshamim723@gmail.com
 */

public class Recursion {

    public void print(int n) {
        if (n < 1) return;
        System.out.printf("%d ", n);
        print(n - 1);
    }

    public void printR(int n) {
        if (n < 1) return;
        printR(n - 1);
        System.out.printf("%d ", n);
    }

    public void print(int n, int limit) {
        if (n > limit) return;
        System.out.printf("%d ", n);
        print(n + 1, limit);
    }

    public int sumOfNthNaturalNumber(int n, int sum) {
        if (n <= 0) return sum;
        sum = sum + n;
        return sumOfNthNaturalNumber(n - 1, sum);
    }

    public void sumOfNthNaturalNumber1(int n, int sum) {
        if (n <= 0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sumOfNthNaturalNumber1(n - 1, sum);
        System.out.printf("%d ", n);
    }

    public int sumOfNthNaturalNumber2(int n) {
        return (n * (n + 1)) / 2;
    }

    public int nthFactorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        return n * nthFactorial(n - 1);
    }

    public void nthFibonacciSequence(int n) {

        int lastFib = 0;
        int lastFib1 = 1;

        System.out.printf("%d %d ", lastFib, lastFib1);

        for (int i = 2; i < n; i++) {

            lastFib1 = lastFib + lastFib1;
            lastFib = lastFib1 - lastFib;

            System.out.printf("%d ", lastFib1);

        }

    }

    public void nthFibonacciSequenceR(int n, int index, int v, int v1) {

        if (index >= n) {
            return;
        }

        v1 = v1 + v;
        v = v1 - v;

        System.out.printf("%d ", v1);

        nthFibonacciSequenceR(n, index + 1, v, v1);

    }

    public void nthFibonacciSequenceR(int n, int v, int v1) {

        if (n < 3) {
            return;
        }

        v1 = v1 + v;
        v = v1 - v;

        System.out.printf("%d ", v1);

        nthFibonacciSequenceR(n - 1, v, v1);

    }

}
