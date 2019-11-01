package glim.antony.katas.kata5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KataFirstVariationOnCaesarCipherTest {

    @Test
    public void movingShift() {
    }

    @Test
    public void demovingShift() {
    }

    @Test
    public void test1() {
        String u = "I should have known that you would have a perfect answer for me!!!";
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(v, KataFirstVariationOnCaesarCipher.movingShift(u, 1));
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 1), 1));
    }

    @Test
    public void characterNumbers() {
        KataFirstVariationOnCaesarCipher.characterNumbers();
    }

    @Test
    public void formula() {
        assertTrue('c'== KataFirstVariationOnCaesarCipher.formula('a', 2));
        assertTrue('b'== KataFirstVariationOnCaesarCipher.formula('z', 2));
        assertTrue('C'== KataFirstVariationOnCaesarCipher.formula('A', 2));
        assertTrue('B'== KataFirstVariationOnCaesarCipher.formula('Z', 2));
    }
}


//	lcA = "abcdefghijklmnopqrstuvwxyz"
//	ucA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"