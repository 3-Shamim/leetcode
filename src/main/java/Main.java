/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৬/১০/২৩
 * Time: ৭:৫৭ PM
 * Email: mdshamim723@gmail.com
 */

public class Main {

    public static void main(String[] args) {

//        System.out.println(findSubstring("caberqiitefg", 5));
//        System.out.println(findSubstring("azerdii", 5));
        System.out.println(findSubstring("qwdftr", 2));

    }

    public static String findSubstring(String s, int k) {

        int lastMax = Integer.MIN_VALUE;
        String result = null;
        int count = 0;
        int startIndex = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean vowel = isVowel(s.charAt(i));
            if (vowel) {
                count++;
            }

            if (i + 1 >= k) {

                if (count != 0 && count > lastMax) {
                    result = s.substring(startIndex, i + 1);
                    lastMax = count;
                }

                if (isVowel(s.charAt(startIndex))) {
                    count--;
                }

                startIndex = (i + 1 - k) + 1;
            }

        }

        return result == null ? "Not found!" : result;

    }

    private static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }


}
