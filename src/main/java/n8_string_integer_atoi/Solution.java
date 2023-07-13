package n8_string_integer_atoi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    final static int MAX = 2147483647;
    final static int MIN = -2147483648;

    public int myAtoi2(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();

        Pattern p = Pattern.compile("^[-+]?\\d+");
        Matcher matcher = p.matcher(s);

        if (matcher.find()) {
            String value = matcher.group();
            return clampedValue(value);
        }

        return 0;
    }

    public int clampedValue(String value) {

        try {
            long num = Long.parseLong(value);
            if (num <= MAX && num >= MIN) {
                return (int) num;
            }

            if (num > MAX) {
                return MAX;
            }

            return MIN;
        } catch (NumberFormatException e) {

            char c = value.charAt(0);

            if (c == '-') {
                return MIN;
            }

            return MAX;
        }

    }

    public int clampedValue(long num) {

        if (num <= MAX && num >= MIN) {
            return (int) num;
        }

        if (num > MAX) {
            return MAX;
        }

        return MIN;
    }

    public int myAtoi(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        s = s.trim();

        int multiplier = 1;
        long number = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (i == 0 && (c == '-' || c == '+')) {
                multiplier = c == '-' ? -1 : 1;
                continue;
            }

            if ('0' > c || c > '9') {
                break;
            }

            number = (number * 10) + (c - '0');

            if (multiplier == 1 && number > MAX) {
                number = MAX;
                break;
            }

            if (multiplier == -1 && number - 1 > MAX) {
                number = MIN;
                break;
            }

        }

        return (int) (number * multiplier);
    }

}

