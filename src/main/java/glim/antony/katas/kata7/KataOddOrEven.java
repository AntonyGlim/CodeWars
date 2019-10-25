package glim.antony.katas.kata7;

import static java.util.Arrays.stream;

/**
 * https://www.codewars.com/kata/5949481f86420f59480000e7/train/java
 * https://www.codewars.com/kata/5949481f86420f59480000e7/solutions/java
 *
 * Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even.
 * Give your answer in string format as 'odd' or 'even'.
 * If the input array is empty consider it as: [0] (array with a zero).
 *
 * oddOrEven([2, 5, 34, 6]) returns "odd".
 */
public class KataOddOrEven {
    public static String oddOrEven (int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
