package glim.antony.katas.kata8;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataWolfInSheepsClothingTest {

    @Test
    public void warnTheSheep() {
        assertEquals("Oi! Sheep number 2! You are about to be eaten by a wolf!",
                KataWolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));

        assertEquals("Oi! Sheep number 5! You are about to be eaten by a wolf!",
                KataWolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));

        assertEquals("Oi! Sheep number 6! You are about to be eaten by a wolf!",
                KataWolfInSheepsClothing.warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));

        assertEquals("Oi! Sheep number 1! You are about to be eaten by a wolf!",
                KataWolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
    }

    @Test
    public void warnTheSheepWolInTheEnd() {
        assertEquals("Pls go away and stop eating my sheep",
                KataWolfInSheepsClothing.warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
}