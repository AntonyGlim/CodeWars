package glim.antony.katas.kata6;

/**
 * https://www.codewars.com/kata/569d488d61b812a0f7000015/train/java
 * https://www.codewars.com/kata/569d488d61b812a0f7000015/solutions/java
 *
 * A stream of data is received and needs to be reversed.
 *
 * Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:
 *
 * 11111111  00000000  00001111  10101010
 *  (byte1)   (byte2)   (byte3)   (byte4)
 * should become:
 *
 * 10101010  00001111  00000000  11111111
 *  (byte4)   (byte3)   (byte2)   (byte1)
 * The total number of bits will always be a multiple of 8.
 *
 * The data is given in an array as such:
 *
 * [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
 * Note: In the C and NASM languages you are given the third parameter which is the number of segment blocks.
 */
public class KataDataReverse {

    public static int[] DataReverse(int[] data) {
        final int chunkSize = 8;
        int[][] chunks = new int[data.length / chunkSize][chunkSize];
        int k = 0;
        for (int i = 0; i < chunks.length; i++) {
            for (int j = 0; j < chunkSize; j++) {
                chunks[i][j] = data[k++];
            }
        }

        int[] result = new int[data.length];
        k = 0;
        for (int i = chunks.length - 1; i >= 0; i--) {
            for (int j = 0; j < chunkSize; j++) {
                result[k++] = chunks[i][j];
            }
        }
        return result;
    }
//    Better solution
//    public static int[] DataReverse(int[] data) {
//        int bytes[] = new int[data.length];
//        for (int i = data.length-8, j=0; i>=0; i-=8, j+=8) {
//            System.arraycopy(data, i, bytes, j, 8);
//        }
//        return bytes;
//    }
}
