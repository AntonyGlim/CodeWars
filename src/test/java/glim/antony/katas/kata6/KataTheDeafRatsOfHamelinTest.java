package glim.antony.katas.kata6;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTheDeafRatsOfHamelinTest {


    @Test
    public void ex1() {
        assertEquals(0, KataTheDeafRatsOfHamelin.countDeafRats("~O~O~O~O P"));
    }

    @Test
    public void ex2() {
        assertEquals(1, KataTheDeafRatsOfHamelin.countDeafRats("P O~ O~ ~O O~"));
    }

    @Test
    public void ex3() {
        assertEquals(2, KataTheDeafRatsOfHamelin.countDeafRats("~O~O~O~OP~O~OO~"));
    }
}