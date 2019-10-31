package glim.antony.katas.kata6;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/find-the-odd-int/train/java
 * https://www.codewars.com/kata/54da5a58ea159efa38000836/solutions/java
 *
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 */
public class KataFindTheOddInt {
    public static int findIt(int[] a) {
        Map<Integer, Integer> valueCount = new HashMap<>();
        for (Integer i : a)  {
            valueCount.compute(i, (k, v) -> v == null ? 1 : v + 1);
        }
        return valueCount.entrySet().stream()
                .filter(entity -> entity.getValue() % 2 == 1)
                .mapToInt(Map.Entry::getKey)
                .findFirst()
                .getAsInt();
    }

//    // Better solution
//    public static int findIt(int[] A) {
//        int xor = 0;
//        for (int i = 0; i < A.length; i++) {
//            xor ^= A[i];
//        }
//        return xor;
//    }
//
//    // Better solution
//    public class FindOdd {
//        public static int findIt(int[] arr) {
//            return stream(arr).reduce(0, (x, y) -> x ^ y);
//        }
//    }
}
