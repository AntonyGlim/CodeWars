package glim.antony.katas.kata6;

/**
* Story
* The Pied Piper has been enlisted to play his magical tune
*  and coax all the rats out of town.
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
        if (town.charAt(0) == 'P') return countOfSubstrings(town, "~O");
        if (town.charAt(town.length() - 1) == 'P') return countOfSubstrings(town, "O~");
        return countOfSubstrings(town.split("P")[0], "O~")
                + countOfSubstrings(town.split("P")[1], "~O");
    }

    public static int countOfSubstrings(String s, String findString){
        if (!s.contains(findString)) return 0;
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1){
            lastIndex = s.indexOf(findString, lastIndex);
            if (lastIndex != -1){
                count++;
                lastIndex += findString.length();
            }
        }
        return count;
    }
}
