package n1614_maximum_nesting_depth_of_the_parentheses;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 1/7/24
 * Time: 10:44 PM
 * Email: mdshamim723@gmail.com
 */

public class No1614 {

    public static int maxDepth(String s) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                count++;

                max = Math.max(max, count);

            } else if (s.charAt(i) == ')') {
                count--;
            }

        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth("()(())((()()))"));

    }

}
