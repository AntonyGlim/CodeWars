package glim.antony.katas.kata6;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/train/java
 * https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8/solutions/java
 * <p>
 * The new "Avengers" movie has just been released!
 * There are a lot of people at the cinema box office standing
 * in a huge line. Each of them has a single 100, 50
 * or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
 * <p>
 * Vasya is currently working as a clerk. He wants to sell
 * a ticket to every single person in this line.
 * <p>
 * Can Vasya sell a ticket to every person and give change
 * if he initially has no money and sells
 * the tickets strictly in the order people queue?
 * <p>
 * Return YES, if Vasya can sell a ticket to every person
 * and give change with the bills he has at hand at that moment.
 * Otherwise return NO.
 * <p>
 * Examples:
 * Line.Tickets(new int[] {25, 25, 50}) // => YES
 * Line.Tickets(new int[]{25, 100}) // => NO.
 * Vasya will not have enough money to give change to 100 dollars
 * Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO.
 * Vasya will not have the right bills to give 75 dollars of change
 * you can't make two bills of 25 from one of 50)
 */
public class KatVasyaClerk {
    public static String Tickets(int[] peopleInLine) {

        Map<Integer, Integer> vasyasCashMachine = new HashMap<>();
        vasyasCashMachine.put(25, 0);
        vasyasCashMachine.put(50, 0);
        vasyasCashMachine.put(100, 0);

        String answer = "YES";
        for (int i : peopleInLine) {
            if (i == 25) {
                vasyasCashMachine.put(25, vasyasCashMachine.get(25) + 1);
                continue;
            }
            if (i == 50 && vasyasCashMachine.get(25) > 0) {
                vasyasCashMachine.put(50, vasyasCashMachine.get(50) + 1);
                vasyasCashMachine.put(25, vasyasCashMachine.get(25) - 1);
                continue;
            } else if (i == 50) {
                answer = "NO";
            }
            if (i == 100) {
                if (vasyasCashMachine.get(25) > 0 && vasyasCashMachine.get(50) > 0){
                    vasyasCashMachine.put(25, vasyasCashMachine.get(25) - 1);
                    vasyasCashMachine.put(50, vasyasCashMachine.get(50) - 1);
                    vasyasCashMachine.put(100, vasyasCashMachine.get(100) + 1);
                    continue;
                }
                if (vasyasCashMachine.get(25) >= 3){
                    vasyasCashMachine.put(25, vasyasCashMachine.get(25) - 3);
                    vasyasCashMachine.put(100, vasyasCashMachine.get(100) + 1);
                } else {
                    answer = "NO";
                }
            }
            if (answer.equals("NO")) break;
        }
        return answer;
    }

    //Better solution
//    public static String Tickets(final int[] peopleInLine) {
//        int k25=0, k50=0;
//        for (int n : peopleInLine) {
//            if (n==25) k25++; // correct
//            else if (n==50 && k25>0) { k50++; k25--; } // $25 change for $50
//            else if (n==100 && k50>0 && k25 > 0) { k50--; k25--; } // $50+$25 change for $100
//            else if (n==100 && k25>2) k25-=3; // 3x$25 change for $100
//            else return "NO";
//        }
//        return "YES";
//    }
}
