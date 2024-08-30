package exp1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> counts = new HashMap<>();

        System.out.println("Enter even integers in the range 2 to 100 (enter -1 to end):");

        while (true) {
            System.out.print("Enter an even integer (-1 to end): ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            if (num < 2 || num > 100 || num % 2 != 0) {
                System.out.println("Please enter a valid even integer between 2 and 100.");
                continue;
            }

            // Count occurrences of each even integer
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Print results
        System.out.println("\nCounts of even integers entered:");
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrence(s)");
        }

        scanner.close();
    }
}