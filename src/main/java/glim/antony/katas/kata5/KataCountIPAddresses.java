package glim.antony.katas.kata5;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/526989a41034285187000de4
 * https://www.codewars.com/kata/526989a41034285187000de4/solutions/java
 *
 * Implement a function that receives two IPv4 addresses,
 * and returns the number of addresses between them
 * (including the first one, excluding the last one).
 *
 * All inputs will be valid IPv4 addresses in the form of strings.
 * The last address will always be greater than the first one.
 *
 * Examples
 * ips_between("10.0.0.0", "10.0.0.50")  ==   50
 * ips_between("10.0.0.0", "10.0.1.0")   ==  256
 * ips_between("20.0.0.10", "20.0.1.0")  ==  246
 */
public class KataCountIPAddresses {
    public static long ipsBetween(String start, String end) {
        return ipv4ToDecNum(end) - ipv4ToDecNum(start);
    }

    public static Long ipv4ToDecNum(String ipv4){
        String binaryString = Arrays.stream(ipv4.split("\\."))
                .map(Long::parseLong)
                .map(b -> String.format("%8s", Long.toBinaryString((b & 0xFF) + 0x100).substring(1)))
                .collect(Collectors.joining());
        return Long.parseLong(binaryString, 2);
    }

//    //Better solution
//    public static long ipsBetween(String start, String end) {
//        return convertToLong(end) - convertToLong(start);
//    }
//
//    private static long convertToLong(String ip) {
//        long res = 0;
//        for (String s : ip.split("[.]") )
//            res = res * 256 + Long.parseLong(s);
//        return res;
//    }
}
