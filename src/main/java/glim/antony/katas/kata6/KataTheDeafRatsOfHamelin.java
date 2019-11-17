package glim.antony.katas.kata6;

/**
* https://www.codewars.com/kata/598106cb34e205e074000031
* https://www.codewars.com/kata/598106cb34e205e074000031/solutions/java
*
* Story
* The Pied Piper has been enlisted to play his magical tune
* and coax all the rats out of town.
*
* But some of the rats are deaf and are going the wrong way!
*
* Kata Task
* How many deaf rats are there?
*
* Legend
* P = The Pied Piper
* O~ = Rat going left
* ~O = Rat going right
* Example
* ex1 ~O~O~O~O P has 0 deaf rats
* ex2 P O~ O~ ~O O~ has 1 deaf rat
* ex3 ~O~O~O~OP~O~OO~ has 2 deaf rats
 */
public class KataTheDeafRatsOfHamelin {
    public static int countDeafRats(final String town) {
        if (town.charAt(0) == 'P') return countOfSubstrings(town, '~', 'O');
        if (town.charAt(town.length() - 1) == 'P') return countOfSubstrings(town, 'O', '~');
        return countOfSubstrings(town.split("P")[0], 'O', '~')
                + countOfSubstrings(town.split("P")[1], '~', 'O');
    }

    public static int countOfSubstrings(String s, char firstSymbol, char secondSymbol){
        if (s.length() < 2) return 0;
        char[] symbols = s.toCharArray();
        int count = 0;
        int i = 0;
        while (i < symbols.length){
            if (symbols[i] == firstSymbol || symbols[i] == secondSymbol){
                if (symbols[i] == firstSymbol && i + 1 < symbols.length && symbols[i + 1] == secondSymbol){
                    count++;
                    i+=2;
                    continue;
                }
                if (symbols[i] == secondSymbol && i + 1 < symbols.length && symbols[i + 1] == firstSymbol){
                    i+=2;
                    continue;
                }
            }
            i++;
        }
        return count;
    }

//    //        Better solution
//    public static int countDeafRats(final String town) {
//        String t = town.replaceAll(" ","");
//        int count = 0;
//        for (int i = 0 ; i < t.length() ; i+=2) if (t.charAt(i) == 'O') count++;
//        return count;
//    }
}
