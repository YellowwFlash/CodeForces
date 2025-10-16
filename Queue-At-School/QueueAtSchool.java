import java.util.Scanner;

public class QueueAtSchool {

    // Approach-1 -> Using simulation
    public static void main(String[] args) {

        // Scanner for the input
        Scanner sc = new Scanner(System.in);

        // Input number of students
        int n = sc.nextInt();

        // Input the time
        int time = sc.nextInt();
        sc.nextLine();

        // Input the string of queue of students
        String queue = sc.nextLine();

        // Get the final string of queue after simulation
        String finalQueue = simulation(queue, n, time);

        // Print the final string of queue
        System.out.println(finalQueue);

        // Close the scanner
        sc.close();
    }

    private static String simulation(String queue, int n, int time) {

        // Divide the string into array
        char[] chars = queue.toCharArray();

        // Simulate the process for time seconds
        for (int i = 0; i < time; i++) {

            // Travese the chars array
            for (int j = 0; j < chars.length - 1; j++) {

                // If the current is B and next is G, swap
                if (chars[j] == 'B' && chars[j + 1] == 'G') {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;

                    // Skip the next iteration
                    j++;
                }
            }
        }

        // Return the final string of queue
        return new String(chars);

    }
}
