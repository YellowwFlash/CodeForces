import java.util.Arrays;
import java.util.Scanner;

public class LightsOut {

    // Approach-1 -> Using 2D array
    public static void main(String[] args) {

        // Define scanner for input
        Scanner sc = new Scanner(System.in);

        // Construct a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Input the values of matrix
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        // Make the lights out
        makeLightsOut(matrix);

        // Close the scanner
        sc.close();

    }

    private static void makeLightsOut(int[][] matrix) {

        // Define lights out matrix
        int[][] lightsOut = new int[3][3];

        // Initialize the lightsOut matrix with 1
        for (int[] row : lightsOut)
            Arrays.fill(row, 1);

        // Loop through the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                // If the current cell is resulting in odd, toggle the lights
                if (matrix[i][j] % 2 == 1) {

                    // Toggle the current cell
                    lightsOut[i][j] = lightsOut[i][j] == 1 ? 0 : 1;

                    // Toggle the top
                    if (i - 1 >= 0)
                        lightsOut[i - 1][j] = lightsOut[i - 1][j] == 1 ? 0 : 1;

                    // Toggle the bottom
                    if (i + 1 < 3)
                        lightsOut[i + 1][j] = lightsOut[i + 1][j] == 1 ? 0 : 1;

                    // Toggle the left
                    if (j - 1 >= 0)
                        lightsOut[i][j - 1] = lightsOut[i][j - 1] == 1 ? 0 : 1;

                    // Toggle the right
                    if (j + 1 < 3)
                        lightsOut[i][j + 1] = lightsOut[i][j + 1] == 1 ? 0 : 1;

                }
            }
        }

        // Print the matrix
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++)
                System.out.print(lightsOut[i][j]);

            System.out.println();
        }
    }
}
