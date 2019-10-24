package glim.antony.katas.kata7;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class KataOnesAndZerosTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList(0, 0, 0, 1), 1},
                {Arrays.asList(0, 0, 1, 0), 2},
                {Arrays.asList(0, 1, 0, 1), 5},
                {Arrays.asList(1, 0, 0, 1), 9},
                {Arrays.asList(0, 0, 1, 0), 2},
                {Arrays.asList(0, 1, 1, 0), 6},
                {Arrays.asList(1, 1, 1, 1), 15},
                {Arrays.asList(1, 0, 1, 1), 11},
        });
    }
    private List<Integer> list;
    private int expect;

    public KataOnesAndZerosTest(List<Integer> list, int expect) {
        this.list = list;
        this.expect = expect;
    }

    @Test
    public void convertBinaryArrayToInt() {
        int result = KataOnesAndZeros.ConvertBinaryArrayToInt(list);
        Assert.assertTrue(expect == result);
    }
}
