package glim.antony.katas.kata5;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTheHungerGamesZooDisasterTest {

    @Test
    public void whoEatsWho() {
        final String input = "fox,bug,chicken,grass,sheep";
        final String[] expected = 	{
                "fox,bug,chicken,grass,sheep",
                "chicken eats bug",
                "fox eats chicken",
                "sheep eats grass",
                "fox eats sheep",
                "fox"};
        assertArrayEquals(expected, KataTheHungerGamesZooDisaster.whoEatsWho(input));
    }

    @Test
    public void preparation() {
        KataTheHungerGamesZooDisaster kataTheHungerGamesZooDisaster = new KataTheHungerGamesZooDisaster();
        kataTheHungerGamesZooDisaster.preparation();
    }

}