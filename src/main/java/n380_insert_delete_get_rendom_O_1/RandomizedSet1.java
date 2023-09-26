package n380_insert_delete_get_rendom_O_1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৯/৯/২৩
 * Time: ৭:৫৯ PM
 * Email: mdshamim723@gmail.com
 */

public class RandomizedSet1 {

    private final Set<Integer> store = new HashSet<>();

    public RandomizedSet1() {

    }

    public boolean insert(int val) {
        return store.add(val);
    }

    public boolean remove(int val) {
        return store.remove(val);
    }

    // This will give you first element every time
    public int getRandom() {
        return store.iterator().next();
    }

}
