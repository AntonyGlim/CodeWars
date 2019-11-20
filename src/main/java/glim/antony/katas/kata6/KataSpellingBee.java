package glim.antony.katas.kata6;

/**
 * https://www.codewars.com/kata/57d6b40fbfcdc5e9280002ee/train/java
 *
 * How many bees are in the beehive?
 * bees can be facing UP, DOWN, LEFT, or RIGHT
 * bees can share parts of other bees
 * Examples
 * Ex1
 * bee.bee
 * .e..e..
 * .b..eeb
 * Answer: 5
 *
 * Ex2
 * bee.bee
 * e.e.e.e
 * eeb.eeb
 * Answer: 8
 *
 * Notes
 * The hive may be empty or null/None/nil/...
 */
public class KataSpellingBee {
    public static int howManyBees(final char [][] hive) {
        StringBuilder horizontalString = new StringBuilder();
        for (int i = 0; i < hive[0].length; i++) {
            for (int j = 0; j < hive.length; j++) {
                horizontalString.append((char) hive[i][j]);
            }
        }
        System.out.println(horizontalString);

        StringBuilder verticalString = new StringBuilder();
        for (int j = 0; j < hive[0].length; j++) {
            for (int i = 0; i < hive.length; i++) {
                verticalString.append(hive[i][j]);
            }
        }
        System.out.println(verticalString);
        return 0;
    }
}
