package glim.antony.katas.kata7;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
 * https://www.codewars.com/kata/578553c3a1b8d5c40300037c/solutions/java
 *
 * Given an array of ones and zeroes, convert the equivalent binary value to an integer.
 *
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 */
public class KataOnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(
                binary.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining("")),
                2);
    }
}
