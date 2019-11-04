package glim.antony.katas.kata6;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/5b4070144d7d8bbfe7000001
 * https://www.codewars.com/kata/numericals-of-a-string/solutions/java
 *
 * You are given an input string.
 * For each symbol in the string if it's the first
 * character occurence, replace it with a '1',
 * else replace it with the amount of times you've already seen it...
 *
 * But will your code be performant enough?
 *
 * Examples:
 * input   =  "Hello, World!"
 * result  =  "1112111121311"
 *
 * input   =  "aaaaaaaaaaaa"
 * result  =  "123456789101112"
 * Note: there will be no int domain overflow
 * (character occurences will be less than 2 billion).
 *
 * There might be some non-ascii characters in the string.
 */
public class KataNumericalsOfString {
    public static String numericals(String s) {
        Map<Character, Integer> valueCount = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : s.toCharArray())  {
            valueCount.compute(ch, (k, v) -> v == null ? 1 : v + 1);
            stringBuilder.append(valueCount.get(ch));
        }
        return stringBuilder.toString();
    }
}
