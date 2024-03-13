import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৬/১০/২৩
 * Time: ৯:০৯ PM
 * Email: mdshamim723@gmail.com
 */

public class Main1 {

    public static void main(String[] args) {

        System.out.println(findSum(List.of(3, 5, 10, 10, 1, 3), List.of(List.of(1, 2, 5))));

    }

    public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {

        List<Long> res = new ArrayList<>();

        for (List<Integer> query : queries) {

            int l = query.get(0);
            int r = query.get(1);
            long x = query.get(2);

            long zeroCount = 0;
            long sum = 0;

            for (int i = l - 1; i < r; i++) {

                Integer integer = numbers.get(i);

                if (integer == 0) {
                    zeroCount++;
                }

                sum += integer;

            }

            res.add(sum + (zeroCount * x));

        }

        return res;
    }

}
