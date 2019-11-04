package glim.antony.katas.kata5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/first-variation-on-caesar-cipher/train/java
 * https://www.codewars.com/kata/5508249a98b3234f420000fb/solutions/java
 * 
 * The action of a Caesar cipher is to replace each plaintext letter with a different
 * one a fixed number of places up or down the alphabet.
 * 
 * This program performs a variation of the Caesar shift.
 * The shift increases by 1 for each character (on each iteration).
 * 
 * If the shift is initially 1, the first character of the message
 * to be encoded will be shifted by 1, the second character will be shifted by 2, etc...
 * 
 * Coding: Parameters and return of function "movingShift"
 * param s: a string to be coded
 * 
 * param shift: an integer giving the initial shift
 * 
 * The function "movingShift" first codes the entire string
 * and then returns an array of strings containing
 * the coded string in 5 parts (five parts because,
 * to avoid more risks, the coded message will be given
 * to five runners, one piece for each runner).
 * 
 * If possible the message will be equally divided by message length
 * between the five runners. If this is not possible,
 * parts 1 to 5 will have subsequently non-increasing lengths,
 * such that parts 1 to 4 are at least as long as when evenly divided,
 * but at most 1 longer. If the last part is the empty string
 * this empty string must be shown in the resulting array.
 * 
 * For example, if the coded message has a length of 17
 * the five parts will have lengths of 4, 4, 4, 4, 1.
 * The parts 1, 2, 3, 4 are evenly split
 * and the last part of length 1 is shorter.
 * If the length is 16 the parts will be
 * of lengths 4, 4, 4, 4, 0. Parts 1, 2, 3, 4
 * are evenly split and the fifth runner will stay at home
 * since his part is the empty string.
 * If the length is 11, equal parts would be of length 2.2,
 * hence parts will be of lengths 3, 3, 3, 2, 0.
 * 
 * You will also implement a "demovingShift" function with two parameters
 * Decoding: parameters and return of function "demovingShift"
 * 1) an array of strings: s (possibly resulting from "movingShift", with 5 strings)
 * 2) an int shift
 * 
 * "demovingShift" returns a string.
 * Example:
 * u = "I should have known that you would have a perfect answer for me!!!"
 * 
 * movingShift(u, 1) returns :
 * v = ["J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ",
 * "gwkzzyq zntyhv", " lvz wp!!!"]
 * 
 * (quotes added in order to see the strings and the spaces,
 * your program won't write these quotes, see Example Test Cases)
 * and demovingShift(v, 1) returns u.
 * 
 * Caesar Cipher : http://en.wikipedia.org/wiki/Caesar_cipher
 */
public class KataFirstVariationOnCaesarCipher {
    public static List<String> movingShift(String s, int shift) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = shift(chars[i], shift++);
        }
        return splitUpString(new String(chars));
    }

    public static String demovingShift(List<String> s, int shift) {
        String list = String.join("", s);
        char[] chars = list.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = deShift(chars[i], shift++);
        }
        return new String(chars);
    }

    public static Character shift(Character ch, int shift) {
        if (ch >= 65 && ch <= 90) { //A-Z
            return (ch - 64 + shift) % 26 == 0 ? 90 : (char) (64 + (ch - 64 + shift) % 26);
        }
        if (ch >= 97 && ch <= 122) { //a-z
            return (ch - 96 + shift) % 26 == 0 ? 122 : (char) (96 + (ch - 96 + shift) % 26);
        }
        return ch;
    }

    public static Character deShift(Character ch, int shift) {
        if (ch >= 65 && ch <= 90) { //A-Z
            return (ch - 64 - shift) % 26 == 0 ? 90 : (char) (89 + (ch - 89 - shift) % 26);
        }
        if (ch >= 97 && ch <= 122) { //a-z
            return (ch - 96 - shift) % 26 == 0 ? 122 : (char) (121 + (ch - 121 - shift) % 26);
        }
        return ch;
    }

    public static int[] findPartsSize(int stringLength) {
        int[] partsSize = new int[5];
        if (stringLength % 5 == 0) {
            Arrays.fill(partsSize, stringLength / 5);
            return partsSize;
        }
        for (int i = 4; i > 0; i--) {
            if (stringLength % i < stringLength / i) {
                for (int j = 0; j < i; j++) {
                    partsSize[j] = stringLength / i;
                }
                partsSize[i] = stringLength % i;
                return findOptimalPartsSize(partsSize, i);
            }
        }
        return partsSize;
    }

    public static int[] findOptimalPartsSize(int[] partsSize, int iterator){
        for (int j = partsSize[0]; j > partsSize[iterator]; j--) {
            for (int k = 0; k < iterator; k++) {
                partsSize[k]--;
            }
            partsSize[iterator] += iterator;
        }
        for (int k = 0; k < iterator; k++) {
            partsSize[k]++;
        }
        partsSize[iterator] -= iterator;
        return partsSize;
    }

    public static List<String> splitUpString(String s) {
        List<String> strings = new ArrayList<>();
        int[] parts = findPartsSize(s.length());
        int beginIndex = 0;
        int endIndex = parts[0];
        for (int i : parts) {
            strings.add(s.substring(beginIndex, endIndex));
            beginIndex = endIndex;
            endIndex = Math.min(beginIndex + i, s.length());
        }
        return strings;
    }
}