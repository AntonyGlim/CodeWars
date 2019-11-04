package glim.antony.katas.kata6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class KataNumericalsOfStringTest {
    @Test
    public void basicTest1() {
        assertEquals("1112111121311", KataNumericalsOfString.numericals("Hello, World!"));
    }
    @Test
    public void basicTest2() {
        assertEquals("11121111213112111131224132411122", KataNumericalsOfString.numericals("Hello, World! It's me, JomoPipi!"));
    }
    @Test
    public void basicTest3() {
        assertEquals("11121122342", KataNumericalsOfString.numericals("hello hello"));
    }

}
