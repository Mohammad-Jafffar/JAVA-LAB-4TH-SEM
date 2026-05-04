
/** write a program using character stream where we will have one text file which will holds all the alphabets a to z
 * now process that file and save all vowels char in one file and non-vowels in another file.
 */

// Import the entire IO library for reading and writing files
import java.io.*;

public class FIleRead {
    public static void main(String[] args) {
        String alphabets = "ALphabets.txt";
        String vowel = "vowels.txt";
        String consonant = "consonant.txt";

        try (FileReader fr = new FileReader("Alphabets.txt"); // to read from the source file
                FileWriter fwV = new FileWriter("vowels.txt"); // to write to vowels
                FileWriter fWC = new FileWriter("consonant.txt")) {// to write to consonants
            // to hold the numeric value for each character read
            int ch;
            // LOOP: Read the file character-by-character
            // fr.read() returns -1 when there's nothing left to read (End Of File)
            while ((ch = fr.read()) != -1) {
                // Convert the number (int) back into a visible character (char
                char text = (char) ch;
                // Only process if it's an actual letter (A-Z or a-z)
                if (Character.isLetter(text)) {
                    // Route the letter to the correct file
                    if (isVowel(text)) {
                        fwV.write(text);
                    } else {
                        fWC.write(text);
                    }
                }
            }
            // the process finished
            System.out.println("Processing complete");
            System.out.println("Vowels : " + vowel);
            System.out.println("Consonent :" + consonant);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * HELPER METHOD: isVowel
     * Purpose: Checks if a character is 'a', 'e', 'i', 'o', or 'u'.
     * Returns: true if it's a vowel, false otherwise.
     */
    public static boolean isVowel(char c) {
        // Convert to lowercase to ensure 'A' is treated the same as 'a'
        c = Character.toLowerCase(c);
        // Return 'true' if the character matches any vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
