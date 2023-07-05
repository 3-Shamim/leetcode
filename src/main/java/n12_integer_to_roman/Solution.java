package n12_integer_to_roman;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    private static final HashMap<Character, Integer> hashMap = new HashMap<>();

    static {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
    }

    public String intToRoman(int num) {

        StringBuilder roman = new StringBuilder();

        while (true) {

            if (num > 1000) {
                num = num % 1000;
                roman.append("M");
            } else if (num > 500) {
                num = num % 500;
                roman.append("D");
            } else if (num > 100) {
                num = num % 100;
                roman.append("C");
            } else if (num > 50) {
                num = num % 50;
                roman.append("L");
            } else if (num > 10) {
                num = num % 10;
                roman.append("M");
            } else if (num > 5) {
                num = num % 5;
                roman.append("V");
            } else {
                break;
            }

        }

        return roman.toString();
    }

}

