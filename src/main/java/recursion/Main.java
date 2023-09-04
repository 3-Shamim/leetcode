package recursion;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৩০/৮/২৩
 * Time: ৯:৫২ PM
 * Email: mdshamim723@gmail.com
 */

public class Main {

    public static void main(String[] args) {

        Recursion recursion = new Recursion();
        recursion.print(5); // Print 5 to 1
        System.out.println();
        recursion.printR(5); // Print 1 to 5
        System.out.println();
        recursion.print(1, 5); // Print 1 to 5
        System.out.println();
        int sum = recursion.sumOfNthNaturalNumber(10, 0); // Print sum of nth natural number
        System.out.println(sum);
        recursion.sumOfNthNaturalNumber1(10, 0); // Print sum of nth natural number
        System.out.println();
        int sum1 = recursion.sumOfNthNaturalNumber2(10); // Print sum of nth natural number
        System.out.println(sum1);
        int n = recursion.nthFactorial(10); // Print nth Factorial
        System.out.println(n);
        recursion.nthFibonacciSequence(10); // Print nth Factorial
        System.out.println();
        System.out.printf("%d %d ", 0, 1);
        recursion.nthFibonacciSequenceR(10, 2, 0, 1); // Print nth Factorial
        System.out.println();
        System.out.printf("%d %d ", 0, 1);
        recursion.nthFibonacciSequenceR(10 - 2, 0, 1); // Print nth Factorial
        System.out.println();
        int v = recursion.powCal(2, 5);// Print Power calculation
        System.out.println(v);
        int v1 = recursion.powCal1(2, 5);// Print Power calculation
        System.out.println(v1);
    }

}
