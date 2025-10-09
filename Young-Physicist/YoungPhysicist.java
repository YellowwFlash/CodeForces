import java.util.Scanner;

public class YoungPhysicist {

    public static void main(String[] args) {

        // Define scanner for the inputs
        Scanner sc = new Scanner(System.in);

        // Input the n lines of input
        int n = sc.nextInt();

        // Define the variables
        int xSum = 0, ySum = 0, zSum = 0;

        // Iterate over the n lines of input
        for (int i = 0; i < n; i++) {

            // Input the x, y and z values of current vector
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            // Add the values to the sum of the x, y and z components
            xSum += x;
            ySum += y;
            zSum += z;
        }

        // If the sum of all components meet 0, then the vectors are at equilibrium
        System.out.println(xSum == 0 && ySum == 0 && zSum == 0 ? "YES" : "NO");

        // Close the scanner
        sc.close();
    }
}