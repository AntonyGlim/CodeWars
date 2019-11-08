package glim.antony.katas.kata6;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/5848565e273af816fb000449/train/java
 * https://www.codewars.com/kata/5848565e273af816fb000449/solutions/java
 *
 * Description:
 * Encrypt this!
 *
 * You want to create secret messages which can be deciphered
 * by the Decipher this! kata. Here are the conditions:
 *
 * Your message is a string containing space separated words.
 * You need to encrypt each word in the message using the following rules:
 * The first letter needs to be converted to its ASCII code.
 * The second letter needs to be switched with the last letter
 * Keepin' it simple: There are no special characters in input.
 * Examples:
 * Kata.encryptThis("Hello") => "72olle"
 * Kata.encryptThis("good") => "103doo"
 * Kata.encryptThis("hello world") => "104olle 119drlo"
 */
public class KataEncryptThis {

    public static String encryptThis(String text) {
        return Arrays.stream(text.split(" "))
                .map(KataEncryptThis::encryptSingleWord)
                .collect(Collectors.joining(" "));
    }

    public static String encryptSingleWord(String word){
        switch (word.length()){
            case 0: return "";
            case 1: return (int) word.charAt(0) + "";
            case 2: return (int) word.charAt(0) + word.substring(1);
            default: return (int) word.charAt(0) + encrypt(word.substring(1));
        }
    }

    public static String encrypt(String word){
        return word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
    }

    //Other solution
//    public static String encryptThis(String text) {
//        return compile(" ").splitAsStream(text)
//                .map(w -> w.isEmpty() ? "" : (int) w.charAt(0) + (w.length() > 2 ? w.replaceFirst(".(.)(.*)(.)", "$3$2$1") : w.substring(1)))
//                .collect(joining(" "));
//    }
}
