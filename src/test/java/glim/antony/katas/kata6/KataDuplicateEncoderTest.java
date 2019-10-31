package glim.antony.katas.kata6;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataDuplicateEncoderTest {

    @Test
    public void encode() {
        assertEquals(")()())()(()()(",
                KataDuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", KataDuplicateEncoder.encode("   ()(   "));
    }
}