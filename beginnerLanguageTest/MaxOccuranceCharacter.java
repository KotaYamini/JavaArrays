package beginnerLanguageTest;
/**
 * Given a string A, return a character from a string with maximum occurrence
 *
 * Note:
 * 1. If more than once character has the same occurrence and return the encountered first.
 * 2. Please read the output format carefully.
 */

public class MaxOccuranceCharacter {

    public static void main(String[] args) {
        String A = "elephantiasis";
        System.out.print(maxOccurrence(A));
    }

    public static String maxOccurrence(String str){
        int A= str.length();
        String strAns = "";
        char maxChar = str.charAt(0);
        int maxCount = 0;
        for(int i=0; i<A; i++){
            char ch = str.charAt(i);
            int count = 0;

            for(int j=0 ; j<A; j++) {
                if (maxChar == ch) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }

        }
        strAns = ""+ maxChar;
        return strAns;
    }
}
