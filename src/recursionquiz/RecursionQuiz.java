/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionquiz;

/**
 *
 * @author ratid6445
 */
public class RecursionQuiz {

    // create a method that reverses the letters in a word
    public String reverseString(String word) {
        // if the word is less than 2 characters then return the letter directly
        if (word.length() < 2) {
            return word;
        }
        // create a string that holds the first letter in the word
        // use a substring that goes through the word starting at position 0 and limiting the string to stop before position 1
        String first = word.substring(0, 1);
        // create a string that holds the last letter in the word
        String last = word.substring(word.length() - 1);
        // if the length is more than or equal to 2 then reverse the word
        if (word.length() >= 2) {
            // reverse the word by putting the last letter first and first letter last
            // then recursively remove letters from last and first positions
            String reversed = last + reverseString(word.substring(1, word.length() - 1)) + first;
            // return the reversed order
            return reversed;
        } else {
            return word;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test the reverseString method
        RecursionQuiz test = new RecursionQuiz();

        //input a word to test reverseString
        String answer = test.reverseString("cat");
        // output the answer of the reversed word
        System.out.println(answer);

        // test more words
        String ans = test.reverseString("frog");
        String ans2 = test.reverseString("umbrella");
        String ans3 = test.reverseString("telephone");
        String ans4 = test.reverseString("racecar");
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
}
