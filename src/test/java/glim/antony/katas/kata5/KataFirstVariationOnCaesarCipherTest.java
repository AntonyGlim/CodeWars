package glim.antony.katas.kata5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KataFirstVariationOnCaesarCipherTest {

    @Test
    public void demovingShift() {
    }

    @Test
    public void test1() {
        String u = "I should have known that you would have a perfect answer for me!!!";
        List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 1), 1));
        assertEquals(v, KataFirstVariationOnCaesarCipher.movingShift(u, 1));
    }
    @Test
    public void test2() {
        String u = "O CAPTAIN! my Captain! our fearful trip is done;";
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 1), 1));
    }
    @Test
    public void test3() {
        String u = "For you bouquets and ribbon'd wreaths--for you the shores a-crowding;";
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 1), 1));
    }
    @Test
    public void test4() {
        String u = "Exult, O shores, and ring, O bells! But I, with mournful tread, Walk the deck my Captain lies, Fallen cold and dead. ";
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 1), 1));
    }
    @Test
    public void testa() {
        String u = " uoxIirmoveNreefckgieaoiEcooqo";
        List<String> v = Arrays.asList(" xscOp", "zvygqA", "ftuwud", "adaxmh", "Edqrut");
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 2), 2));
        assertEquals(v, KataFirstVariationOnCaesarCipher.movingShift(u, 2));
    }
    @Test
    public void testb() {
        String u = "uaoQop jx eh osr okaKv vzagzwpxagokBKriipmc U";
        List<String> v = Arrays.asList("wdsVuw sh", " qu dii h", "evGs uzbi", "caudhoxuM", "Wewxfdu O");
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 2), 2));
        assertEquals(v, KataFirstVariationOnCaesarCipher.movingShift(u, 2));
    }
    @Test
    public void testc() {
        String u = "kgpiqislyhvmffdzlyehjiIteAaaotcoapk bbMgaHlda";
        List<String> v = Arrays.asList("mjtnwpaui", "shztutqdr", "ycffGseBc", "dsyiviyu ", "noAvqYdwu");
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 2), 2));
        assertEquals(v, KataFirstVariationOnCaesarCipher.movingShift(u, 2));
    }
    @Test
    public void testd() {
        String u = "abcdefghjuty";
        List<String> v = Arrays.asList("bdf", "hjl", "nps", "eek", "");
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 1), 1));
        assertEquals(v, KataFirstVariationOnCaesarCipher.movingShift(u, 1));
    }
    @Test
    public void teste() {
        String u = "abcdefghjuty1234";
        List<String> v = Arrays.asList("bdfh", "jlnp", "seek", "1234", "");
        assertEquals(u, KataFirstVariationOnCaesarCipher.demovingShift(KataFirstVariationOnCaesarCipher.movingShift(u, 1), 1));
        assertEquals(v, KataFirstVariationOnCaesarCipher.movingShift(u, 1));
    }

    @Test
    public void shift() {
        assertEquals('c', (char) KataFirstVariationOnCaesarCipher.shift('a', 2));
        assertEquals('a', (char) KataFirstVariationOnCaesarCipher.shift('c', -2));
        assertEquals('z', (char) KataFirstVariationOnCaesarCipher.shift('z', 0));
        assertEquals('C', (char) KataFirstVariationOnCaesarCipher.shift('A', 2));
        assertEquals('B', (char) KataFirstVariationOnCaesarCipher.shift('Z', 2));
        assertEquals('(', (char) KataFirstVariationOnCaesarCipher.shift('(', 2));
    }

    @Test
    public void findPartsSize() {
        assertArrayEquals(new int[] {3, 3, 3, 3, 3}, KataFirstVariationOnCaesarCipher.findPartsSize(15));
        assertArrayEquals(new int[] {4, 4, 4, 4, 1}, KataFirstVariationOnCaesarCipher.findPartsSize(17));
        assertArrayEquals(new int[] {3, 3, 3, 2, 0}, KataFirstVariationOnCaesarCipher.findPartsSize(11));
        assertArrayEquals(new int[] {4, 4, 4, 4, 0}, KataFirstVariationOnCaesarCipher.findPartsSize(16));
        assertArrayEquals(new int[] {14, 14, 14, 14, 10}, KataFirstVariationOnCaesarCipher.findPartsSize(66));
    }
}