package n10_regular_expression_matching;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

//        System.out.printf("%b - %b\n", solution.isMatch("", ""), true);
//        System.out.printf("%b - %b\n", solution.isMatch("a", ""), false);
//        System.out.printf("%b - %b\n", solution.isMatch("", "a"), false);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", "a"), false);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", "ab"), false);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", "aa"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", ".."), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", "a."), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", ".a"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", "a*"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aaaaaa", "a*"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aaaaaa", "aaaa"), false);
//        System.out.printf("%b - %b\n", solution.isMatch("aaa", "aaaa"), false);
//        System.out.printf("%b - %b\n", solution.isMatch("aa", ".*"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("ab", ".*"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("absadsagfeffsdffef", ".*"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aaab", "a.ab*"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("aab", "c*a*b"), true);
//        System.out.printf("%b - %b\n", solution.isMatch("ccaab", "c*a*b"), true);

//        System.out.printf("%b - %b\n", solution.isMatch("dccaab", "c*a*b"), false);
        System.out.printf("%b - %b\n", solution.isMatch("a", ".*..a*"), false);

    }

}
