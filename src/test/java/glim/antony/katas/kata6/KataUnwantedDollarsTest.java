package glim.antony.katas.kata6;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataUnwantedDollarsTest {

    @Test
    public void moneyValue() {
        assertEquals(12.34, KataUnwantedDollars.moneyValue("12.34"), 1e-9);
        assertEquals(5.67, KataUnwantedDollars.moneyValue(" $5.67"), 1e-9);
        assertEquals(-0.89, KataUnwantedDollars.moneyValue("-0.89"), 1e-9);
        assertEquals(-0.10, KataUnwantedDollars.moneyValue("-$ 0.1"), 1e-9);
        assertEquals(-2.3456, KataUnwantedDollars.moneyValue("$-2.3456"), 1e-9);
        assertEquals(7, KataUnwantedDollars.moneyValue("007"), 1e-9);
        assertEquals(89.0, KataUnwantedDollars.moneyValue(" $ 89"), 1e-9);
        assertEquals(0.11, KataUnwantedDollars.moneyValue("   .11"), 1e-9);
        assertEquals(0.20, KataUnwantedDollars.moneyValue("$.2"), 1e-9);
        assertEquals(-0.34, KataUnwantedDollars.moneyValue("-.34"), 1e-9);
        assertEquals(0.0, KataUnwantedDollars.moneyValue("$$$"), 1e-9);
    }
}