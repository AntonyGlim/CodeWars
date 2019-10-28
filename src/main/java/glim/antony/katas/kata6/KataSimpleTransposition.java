package glim.antony.katas.kata6;

/**
 * https://www.codewars.com/kata/57a153e872292d7c030009d4/train/java
 * https://www.codewars.com/kata/57a153e872292d7c030009d4/solutions/java
 *
 * Simple transposition is a basic and simple cryptography technique. We make 2 rows and put first a letter in the Row 1, the second in the Row 2, third in Row 1 and so on until the end. Then we put the text from Row 2 next to the Row 1 text and thats it.
 *
 * Complete the function that recieves a string and encrypt it with this simple transposition.
 *
 * Example
 * For example if the text to encrypt is: "Simple text", the 2 rows will be:
 *
 * Row 1	S	m	l		e	t
 * Row 2	i	p	e	t	x
 *
 * So the result string will be: `"Sml etipetx"`
 */
public class KataSimpleTransposition {
    public static String simpleTransposition(String text) {
        StringBuilder oddStringBuilder = new StringBuilder();
        StringBuilder evenStringBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                oddStringBuilder.append(chars[i]);
            }
            if (i % 2 == 1) {
                evenStringBuilder.append(chars[i]);
            }
        }
        return "" + oddStringBuilder + evenStringBuilder;
    }

//        Better solution
//    public static String simpleTransposition(String text) {
//        String right = "";
//        String left = "";
//        for (int i=0; i<text.length(); i++) {
//            if (i%2 == 0) left+=text.charAt(i);
//            else right+=text.charAt(i);
//        }
//        return left+right;
//    }
}
