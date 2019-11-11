package glim.antony.katas.kata6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KataStreetFighter2CharacterSelectionTest {
    String[][] fighters = new String[][]{
            new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
            new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" },
    };

    @Test
    public void shouldWorkWithNoMoves() {
        String[] solution = new String[]{};
        assertEquals(solution, KataStreetFighter2CharacterSelection.streetFighterSelection(fighters, new int[]{0,0}, new String[]{}));
    }

    @Test
    public void shouldWorkWithFewMoves(){
        String[] moves = new String[] { "up", "left", "right", "left", "left" };
        String[] solution = new String[] { "Ryu", "Vega", "Ryu", "Vega", "Balrog" };
        assertEquals(solution, KataStreetFighter2CharacterSelection.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingLeft(){
        String[] moves = new String[] { "left", "left", "left", "left", "left", "left", "left", "left" };
        String[] solution = new String[] { "Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog" };
        assertEquals(solution, KataStreetFighter2CharacterSelection.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingRight(){
        String[] moves = new String[] { "right", "right", "right", "right", "right", "right", "right", "right" };
        String[] solution = new String[] { "E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka" };
        assertEquals(solution, KataStreetFighter2CharacterSelection.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    public void shouldUseAll4DirectionsClockwiseTwice(){
        String[] moves = new String[] { "up", "left", "down", "right", "up", "left", "down", "right" };
        String[] solution = new String[] { "Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken" };
        assertEquals(solution, KataStreetFighter2CharacterSelection.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingDown(){
        String[] moves = new String[] { "down", "down", "down", "down" };
        String[] solution = new String[] { "Ken", "Ken", "Ken", "Ken" };
        assertEquals(solution, KataStreetFighter2CharacterSelection.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    public void shouldWorkWhenAlwaysMovingUp(){
        String[] moves = new String[] { "up", "up", "up", "up" };
        String[] solution = new String[] { "Ryu", "Ryu", "Ryu", "Ryu" };
        assertEquals(solution, KataStreetFighter2CharacterSelection.streetFighterSelection(fighters, new int[] {0,0}, moves));
    }

    @Test
    public void moveTest(){
        KataStreetFighter2CharacterSelection.Position positionExpected = new KataStreetFighter2CharacterSelection.Position(0, 0);
        KataStreetFighter2CharacterSelection.Position positionStart = new KataStreetFighter2CharacterSelection.Position(0, 0);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "up", 8, 2)));

        positionExpected.setX(0); positionExpected.setY(0);
        positionStart.setX(1); positionStart.setY(0);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "up", 8, 2)));

        positionExpected.setX(1); positionExpected.setY(0);
        positionStart.setX(0); positionStart.setY(0);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "down", 8, 2)));

        positionExpected.setX(1); positionExpected.setY(0);
        positionStart.setX(1); positionStart.setY(0);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "down", 8, 2)));

        positionExpected.setX(1); positionExpected.setY(1);
        positionStart.setX(1); positionStart.setY(0);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "right", 8, 2)));

        positionExpected.setX(1); positionExpected.setY(0);
        positionStart.setX(1); positionStart.setY(7);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "right", 8, 2)));


        positionExpected.setX(1); positionExpected.setY(6);
        positionStart.setX(1); positionStart.setY(7);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "left", 8, 2)));

        positionExpected.setX(1); positionExpected.setY(7);
        positionStart.setX(1); positionStart.setY(0);
        assertTrue(positionExpected.equals(KataStreetFighter2CharacterSelection.move(positionStart, "left", 8, 2)));
    }
}