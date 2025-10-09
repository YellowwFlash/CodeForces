import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {

        // Define scanner for the input
        Scanner sc = new Scanner(System.in);

        // Define the coordinates of the element
        int x = -1, y = -1;

        // Get the input of the matrix
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                // Get the input of the matrix
                int element = sc.nextInt();

                // If the element is 1, store the coordinates
                if (element == 1) {
                    x = i;
                    y = j;
                }
            }
        }

        // Print the coordinates of the element
        System.out.println(Math.abs(x - 3) + Math.abs(y - 3));

        // Close the scanner
        sc.close();
    }
}
