package glim.antony.katas.kata6;

/**
 * https://www.codewars.com/kata/unwanted-dollars/train/java
 * https://www.codewars.com/kata/587309155cfd6b9fb60000a0/solutions/java
 *
 * If you're faced with an input box, like this:
 *
 *                                            +--------------+
 *   Enter the price of the item, in dollars: |              |
 *                                            +--------------+
 * do you put the $ sign in, or not? Inevitably, some people will type a $ sign
 * and others will leave it out. The instructions could be made clearer -
 * but that won't help those annoying people who never read instructions anyway.
 *
 * A better solution is to write code that can handle
 * the input whether it includes a $ sign or not.
 *
 * So, we need a simple function that converts a string
 * representing a number (possibly with a $ sign in front of it)
 * into the number itself.
 *
 * Remember to consider negative numbers (the - sign may come either
 * before or after the $ sign, if there is one),
 * and any extraneous space characters (leading, trailing,
 * or around the $ sign) that the users might put in.
 * You do not need to handle trailing characters other than spaces
 * (e.g. "1.2 3"). If the given string does not represent a number,
 * (either with or without a $ sign), return 0.0 .
 */
public class KataUnwantedDollars {
    public static double moneyValue(String money){
        money = money.replaceAll("[ $]", "");
        if (money.startsWith("-") && money.indexOf(".") == 1) money = "-0" + money.substring(1);
        if (money.startsWith(".")) money = "0" + money;
        if (money.equals("") || money.equals("-")) return 0;
        return Double.parseDouble(money);
    }

//    //Better solution
//    public static double moneyValue(String money){
//        try {
//            return Double.parseDouble(money.replaceAll("[ $]", ""));
//        } catch(NumberFormatException e) {
//            return 0.0;
//        }
//    }
}
