package glim.antony.katas.kata8;

/**
 * https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15
 * https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/solutions/java
 *
 * Wolves have been reintroduced to Great Britain.
 * You are a sheep farmer, and are now plagued
 * by wolves which pretend to be sheep.
 * Fortunately, you are good at spotting them.
 *
 * Warn the sheep in front of the wolf
 * that it is about to be eaten.
 * Remember that you are standing
 * at the front of the queue
 * which is at the end of the array:
 *
 * [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep] (YOU ARE HERE)
 *    7      6      5      4      3            2      1
 * If the wolf is the closest animal to you,
 * return "Pls go away and stop eating my sheep".
 * Otherwise, return
 * "Oi! Sheep number N! You are about to be eaten by a wolf!"
 * where N is the sheep's position in the queue.
 *
 * Note: there will always be exactly one wolf in the array.
 *
 * Examples
 * warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) ===
 * "Oi! Sheep number 1! You are about to be eaten by a wolf!"
 *
 * warnTheSheep(["sheep", "sheep", "wolf"]) ===
 * "Pls go away and stop eating my sheep"
 */
public class KataWolfInSheepsClothing {

    public static String warnTheSheep(String[] array) {
        if (array[array.length - 1].equals("wolf")) return "Pls go away and stop eating my sheep";
        int wolfIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("wolf")) {
                wolfIndex = i;
            }
        }
        int shipIndex = array.length - wolfIndex - 1;
        return String.format("Oi! Sheep number %s! You are about to be eaten by a wolf!", shipIndex);
    }

//    //Better solution
//    public static String warnTheSheep(String[] array) {
//        int wolfN = java.util.Arrays.asList(array).indexOf("wolf") + 1;
//        return wolfN == array.length ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + (array.length - wolfN) + "! You are about to be eaten by a wolf!";
//    }

}
