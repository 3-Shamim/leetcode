package n380_insert_delete_get_rendom_O_1;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        RandomizedSet obj = new RandomizedSet();
        obj.insert(0);
        System.out.println(RandomizedSet.map);
        System.out.println(RandomizedSet.store);
        obj.insert(1);
        System.out.println(RandomizedSet.map);
        System.out.println(RandomizedSet.store);
        obj.remove(0);
        System.out.println(RandomizedSet.map);
        System.out.println(RandomizedSet.store);
        obj.insert(2);
        System.out.println(RandomizedSet.map);
        System.out.println(RandomizedSet.store);
        obj.remove(1);
        System.out.println(RandomizedSet.map);
        System.out.println(RandomizedSet.store);
        int param_3 = obj.getRandom();
        System.out.println(param_3);

    }

}
