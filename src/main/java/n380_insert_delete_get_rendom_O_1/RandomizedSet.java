package n380_insert_delete_get_rendom_O_1;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৯/৯/২৩
 * Time: ৭:৫৯ PM
 * Email: mdshamim723@gmail.com
 */

public class RandomizedSet {

    public static final Map<Integer, Integer> map = new HashMap<>();
    public static final List<Integer> store = new ArrayList<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {

        if (map.containsKey(val)) {
            return false;
        }

        store.add(val);
        map.put(val, store.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        if (!map.containsKey(val)) {
            return false;
        }

        Integer index = map.get(val);
        Collections.swap(store, index, store.size() - 1);

        map.put(store.get(index), index);

        store.remove(store.size() - 1);
        map.remove(val);

        return true;
    }

    // This will give you first element every time
    public int getRandom() {
        Random random = new Random();
        int index = random.nextInt(store.size());
        return store.get(index);
    }

}
