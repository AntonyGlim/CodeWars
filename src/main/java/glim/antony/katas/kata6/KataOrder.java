package glim.antony.katas.kata6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f/solutions/java
 *
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 *
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 *
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 *
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 */
public class KataOrder {
    public static String order(String words) {
        if (words.equals("")) return "";
        List<String> strings = Arrays.asList(words.split(" "));
        String[] arr = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            for (Character ch : strings.get(i).toCharArray()) {
                if (Character.isDigit(ch)) {
                    arr[i] = ch + " " + strings.get(i);
                }
            }
        }
        return Arrays.stream(arr)
                .sorted()
                .map(s -> s.substring(1))
                .collect(Collectors.joining())
                .trim();

//        Better solution
//        return Arrays.stream(words.split(" "))
//                .sorted((a, b) -> {
//                    return a.replaceAll("\\D+", "").compareTo(b.replaceAll("\\D+", ""));
//                }).collect(Collectors.joining(" "));
    }


}
