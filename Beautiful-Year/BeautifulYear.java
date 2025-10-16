import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {

    // Approach-1 -> Using set
    public static void main(String[] args) {

        // Define scanner
        Scanner sc = new Scanner(System.in);

        // Input the current year
        int year = sc.nextInt();

        // Start traversal from the current year
        while (true) {

            // Get the next year
            year++;

            // Check if the year is beautiful
            if (isBeautiful(year)) {

                // Print the beautiful year
                System.out.println(year);

                // Close the scanner
                sc.close();

                // Exit the loop
                break;
            }
        }
    }

    private static boolean isBeautiful(int year) {

        // Define a set to store the digits of the year
        Set<Integer> digits = new HashSet<>();

        // Convert the year to a string
        String yearStr = String.valueOf(year);

        for (int i = 0; i < yearStr.length(); i++)
            if (!digits.add(yearStr.charAt(i) - '0'))
                return false;

        return true;
    }
}
