package glim.antony.katas.kata7;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class KataOddOrEvenTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[] {2, 5, 34, 6}, "odd"},
                {new int[] {0, 0, 1, 0}, "odd"},
                {new int[] {0, 1, 0, 1}, "even"},
                {new int[] {1, 0, 0, 1}, "even"},
                {new int[] {0, 0, 1, 0}, "odd"},
                {new int[] {0, 1, 1, 0}, "even"},
                {new int[] {1, 1, 1, 1}, "even"},
                {new int[] {1, 0, 1, 1}, "odd"},
        });
    }
    private int[] arr;
    private String expect;

    public KataOddOrEvenTest(int[] arr, String expect) {
        this.arr = arr;
        this.expect = expect;
    }

    @Test
    public void oddOrEven() {
        String result = KataOddOrEven.oddOrEven(arr);
        Assert.assertTrue(expect.equals(result));
    }
}
