package n744_find_smallest_letter_greater_than_target;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */


/*
 * LeetCode: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 */

public class No744 {

    // Solve with binary search
    public static char nextGreatestLetter1(char[] letters, char target) {

        if (target > letters[letters.length - 1] || letters[letters.length - 1] == target) {
            return letters[0];
        }

        int start = 0, end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (letters[mid] == target) {
                return letters[mid + 1];
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return letters[start];
    }

    // Solve with binary search
    public static char nextGreatestLetter2(char[] letters, char target) {

        if (target > letters[letters.length - 1]) {
            return letters[0];
        }

        int start = 0, end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return start < letters.length ? letters[start] : letters[0];
    }

    // Solve with binary search
    public static char nextGreatestLetter3(char[] letters, char target) {

        int start = 0, end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return letters[start % letters.length];
    }

    // Solve with linear search
    public static char nextGreatestLetter(char[] letters, char target) {

        for (int i = 0; i < letters.length; i++) {

            if (letters[i] == target) {
                return letters[(i + 1) % letters.length];
            }

        }

        return letters[0];
    }

    public static void main(String[] args) {

        System.out.println(nextGreatestLetter(new char[]{'A', 'B', 'C', 'D', 'E'}, 'E'));

    }

}
