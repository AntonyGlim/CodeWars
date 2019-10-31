package glim.antony.katas.kata6;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/duplicate-encoder/train/java
 *
 * The goal of this exercise is to convert a string
 * to a new string where each character in the new string
 * is "(" if that character appears only once in the original string,
 * or ")" if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 *
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 */
public class KataDuplicateEncoder {
    static String encode(String word){
        Map<Character, Integer> valueCount = new HashMap<>();
        for (Character ch : word.toLowerCase().toCharArray())  {
            valueCount.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : word.toLowerCase().toCharArray()) {
            if (isMoreThanOnce(ch, valueCount)){
                stringBuilder.append(")");
            } else {
                stringBuilder.append("(");
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isMoreThanOnce(Character ch, Map<Character, Integer> valueCount){
        return valueCount.get(ch) > 1;
    }

//    //Better solution
//    static String encode(String word){
//        return word.toLowerCase()
//                .chars()
//                .mapToObj(i -> String.valueOf((char)i))
//                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
//                .collect(Collectors.joining());
//    }
}
