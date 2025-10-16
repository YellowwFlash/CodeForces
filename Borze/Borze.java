package Borze;

import java.util.Scanner;

public class Borze {

    // Approach-1 -> Using switch case
    public static void main(String[] args) {

        // Define scanner for input
        Scanner sc = new Scanner(System.in);

        // Input the string
        String morse = sc.nextLine();

        // Decode the morse code
        String decoded = decode(morse);

        // Print the decoded string
        System.out.println(decoded);

        // Close the scanner
        sc.close();
    }

    private static String decode(String morse) {

        // Define answer string
        StringBuilder answer = new StringBuilder();
        int n = morse.length();

        // Traverse the morse code
        for (int i = 0; i < n; i++) {

            switch (morse.charAt(i)) {
                case '.':
                    answer.append("0");
                    break;

                case '-':
                    if (i + 1 < n && morse.charAt(i + 1) == '.')
                        answer.append("1");

                    else
                        answer.append("2");
                    i++;
                    break;
                default:
                    break;
            }
        }

        return answer.toString();
    }
}
