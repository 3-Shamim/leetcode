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

        while (num > 0) {

            if (num >= 1000) {
                num = num - 1000;
                roman.append("M");
            } else if (num >= 500) {
                if (num >= 900) {
                    num = num - 900;
                    roman.append("CM");
                } else {
                    num = num - 500;
                    roman.append("D");
                }
            } else if (num >= 100) {
                if (num >= 400) {
                    num = num - 400;
                    roman.append("CD");
                } else {
                    num = num - 100;
                    roman.append("C");
                }
            } else if (num >= 50) {
                if (num >= 90) {
                    num = num - 90;
                    roman.append("XC");
                } else {
                    num = num - 50;
                    roman.append("L");
                }
            } else if (num >= 10) {
                if (num >= 40) {
                    num = num - 40;
                    roman.append("XL");
                } else {
                    num = num - 10;
                    roman.append("X");
                }
            } else if (num >= 5) {
                if (num == 9) {
                    num = num - 9;
                    roman.append("IX");
                } else {
                    num = num - 5;
                    roman.append("V");
                }
            } else {
                if (num == 4) {
                    num = num - 4;
                    roman.append("IV");
                } else {
                    num = num - 1;
                    roman.append("I");
                }
            }

        }

        return roman.toString();
    }

}

