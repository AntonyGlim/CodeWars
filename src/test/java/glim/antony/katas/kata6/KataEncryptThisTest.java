package glim.antony.katas.kata6;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataEncryptThisTest {

    @Test
    public void exampleTests() {
        assertEquals("", KataEncryptThis.encryptThis(""));
        assertEquals("65 119esi 111dl 111lw 108dvei 105n 97n 111ka", KataEncryptThis.encryptThis("A wise old owl lived in an oak"));
        assertEquals("84eh 109ero 104e 115wa 116eh 108sse 104e 115eokp", KataEncryptThis.encryptThis("The more he saw the less he spoke"));
        assertEquals("84eh 108sse 104e 115eokp 116eh 109ero 104e 104dare", KataEncryptThis.encryptThis("The less he spoke the more he heard"));
        assertEquals("87yh 99na 119e 110to 97ll 98e 108eki 116tah 119esi 111dl 98dri", KataEncryptThis.encryptThis("Why can we not all be like that wise old bird"));
        assertEquals("84kanh 121uo 80roti 102ro 97ll 121ruo 104ple", KataEncryptThis.encryptThis("Thank you Piotr for all your help"));
    }

    @Test
    public void encryptSingleWord() {
        assertEquals("65", KataEncryptThis.encryptSingleWord("A"));
        assertEquals("119esiteirtuy", KataEncryptThis.encryptSingleWord("wysiteirtue"));
        assertEquals("111dl", KataEncryptThis.encryptSingleWord("old"));
        assertEquals("111lw", KataEncryptThis.encryptSingleWord("owl"));
    }

    @Test
    public void simpleTest(){
        System.out.println("ManyToOne");
        KataEncryptThis.encrypt("ManyToOne");
    }
}