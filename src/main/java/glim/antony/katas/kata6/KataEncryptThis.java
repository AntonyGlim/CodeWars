package glim.antony.katas.kata6;

/**
 * https://www.codewars.com/kata/5848565e273af816fb000449/train/java
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
        if (text.length() < 3) return text;
        String result = text.charAt(1) + text.substring(2, text.length() - 2);
        System.out.println(result);
        return result;
    }
}
