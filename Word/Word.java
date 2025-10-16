package Word;

import java.util.Scanner;

public class Word {

    // Approach-1 -> Using counts of uppercase and lowercase
    public static void main(String[] args) {

        // Define scanner for input
        Scanner sc = new Scanner(System.in);

        // Define input string and take input
        String input = sc.nextLine();

        // Define the counts of upper and lower case chars
        int upper = 0, lower = 0;

        // Iterate the string
        for (char character : input.toCharArray())

            // If the character is uppercase, increase the uppercase count
            if (character >= 'A' && character <= 'Z')
                upper++;

            // If not, simply increase the lowercase count
            else
                lower++;

        // Print the final result
        System.out.println(upper > lower ? input.toUpperCase() : input.toLowerCase());

        // Close the scanner
        sc.close();
    }
}
