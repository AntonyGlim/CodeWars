package glim.antony.katas.kata6;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java
 * https://www.codewars.com/kata/59df2f8f08c6cec835000012/solutions/java
 *
 * John has invited some friends. His list is:
 *
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 *
 * Could you make a program that makes this string uppercase
 * gives it sorted in alphabetical order by last name.
 * When the last names are the same, sort them by first name.
 * Last name and first name of a guest come in the result between parentheses separated by a comma.
 *
 * So the result of function meeting(s) will be:
 *
 * "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
 * It can happen that in two distinct families with the same family name two people have the same first name too.
 */
public class KataMeeting {

    public static String meeting(String s) {
        String[] secondFirstNameArr = s.split(";");
        Map<String, List<String>> secondFirstNameMap = new TreeMap<>();
        for (String s1 : secondFirstNameArr) {
            String[] secondFirstNameOfOneUserArr = s1.split(":");
            String firstName = secondFirstNameOfOneUserArr[0].toUpperCase();
            String lastName = secondFirstNameOfOneUserArr[1].toUpperCase();
            if (!secondFirstNameMap.containsKey(lastName)){
                secondFirstNameMap.put(lastName, new ArrayList<>());
            }
            secondFirstNameMap.get(lastName).add(firstName);
        }
        for (List<String> firstNames : secondFirstNameMap.values()) {
            Collections.sort(firstNames);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entity : secondFirstNameMap.entrySet()) {
            for (String firstName : entity.getValue()) {
                stringBuilder.append("(").append(entity.getKey()).append(", ").append(firstName).append(")");
            }
        }
        return stringBuilder.toString();
    }

//    Better solution
//    public static String meeting(String s) {
//        return Arrays.stream(s.toUpperCase().split(";"))
//                .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
//                .sorted()
//                .collect(Collectors.joining(""));
//    }

}
