package n2485_find_the_pivot_integer;

class Solution {

    public int pivotInteger(int n) {

        int l = 0;
        int sum = (n * (n + 1) / 2);

        for (int i = 1; i <= n; i++) {

            int r = sum - l;

            l += i;

            if (l == r) {
                return i;
            }

        }

        return -1;
    }

    public int pivotInteger1(int n) {

        int l = 0;

        for (int i = 1; i <= n; i++) {

            l += i;
            int r = 0;

            for (int j = i; j <= n; j++) {
                r += j;
            }

            if (l == r) {
                return i;
            }

        }


        return -1;
    }

}