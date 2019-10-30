package glim.antony.katas.kata5;

import org.junit.Assert;
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
        KataTheHungerGamesZooDisaster kataTheHungerGamesZooDisaster = new KataTheHungerGamesZooDisaster();
        kataTheHungerGamesZooDisaster.whoEatsWho(input);
        assertArrayEquals(expected, kataTheHungerGamesZooDisaster.whoEatsWho(input));
    }

    //grass,grass,cow,leaves,bug,big-fish,leaves,bear
    @Test
    public void whoEatsWho2() {
        final String input = "grass,grass,cow,leaves,bug,big-fish,leaves,bear";
        final String[] expected = 	{
                "grass,grass,cow,leaves,bug,big-fish,leaves,bear",
                "cow eats grass",
                "cow eats grass",
                "bug eats leaves", //cow,bug,big-fish,leaves,bear"
                "bear eats leaves", //cow,bug,big-fish,bear"
                "bear eats big-fish", //cow,bug,bear"
                "bear eats bug",
                "bear eats cow",
                "bear"};
        KataTheHungerGamesZooDisaster kataTheHungerGamesZooDisaster = new KataTheHungerGamesZooDisaster();
        kataTheHungerGamesZooDisaster.whoEatsWho(input);
        assertArrayEquals(expected, kataTheHungerGamesZooDisaster.whoEatsWho(input));
    }

    @Test
    public void preparation() {
        KataTheHungerGamesZooDisaster kataTheHungerGamesZooDisaster = new KataTheHungerGamesZooDisaster();
        kataTheHungerGamesZooDisaster.mapInitialization();
    }

//    @Test
//    public void canEat(){
//        KataTheHungerGamesZooDisaster kataTheHungerGamesZooDisaster = new KataTheHungerGamesZooDisaster();
//        Assert.assertTrue(kataTheHungerGamesZooDisaster.canEat("chicken", "bug"));
//        Assert.assertTrue(kataTheHungerGamesZooDisaster.canEat("fox", "chicken"));
//        Assert.assertTrue(kataTheHungerGamesZooDisaster.canEat("fox", "sheep"));
//        Assert.assertFalse(kataTheHungerGamesZooDisaster.canEat("chicken", "chicken"));
//    }

}