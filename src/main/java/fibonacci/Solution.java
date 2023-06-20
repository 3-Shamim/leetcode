package fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    // 0 1 1 2 3 5 8 13 ...

    public int fibonacci(int nth) { // nth number of fibonacci

        if (nth < 0) {
            System.out.println("Negative position are not allowed.");
            return -1;
        }

        if (nth == 0 || nth == 1) {
            return nth;
        }

        int a = 0, b = 1, fib = 0;

        for (int i = 2; i <= nth; i++) {

            fib = a + b;
            a = b;
            b = fib;

        }

        return fib;
    }

    private static int i = 0;

    public int fibonacciR(int nth) { // nth number of fibonacci with recursion

        i = 0;

        if (nth < 0) {
            System.out.println("Negative position are not allowed.");
            return -1;
        }

        return fibR(nth);
    }

    private int fibR(int nth) {

        System.out.println(i++);

        if (nth <= 1) {
            return nth;
        }

        return fibR(nth - 1) + fibR(nth - 2);
    }


    public int fibonacciDP(int nth) { // nth number of fibonacci with DP (recursion)

        i = 0;

        if (nth < 0) {
            System.out.println("Negative position are not allowed.");
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        return fibDP(nth, map);
    }


    private int fibDP(int nth, Map<Integer, Integer> map) {

        System.out.println(i++);

        if (nth <= 1) {
            return nth;
        }

        Integer num = map.get(nth);

        if (num != null) {
            return num;
        }

        int value = fibDP(nth - 1, map) + fibDP(nth - 2, map);

        map.put(nth, value);

        return value;
    }

}

