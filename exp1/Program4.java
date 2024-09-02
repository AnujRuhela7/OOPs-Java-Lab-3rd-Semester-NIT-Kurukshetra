package exp1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> frequency = new HashMap<>();

        System.out.println("Enter even integers in the range 2 to 100 (enter -1 to end):");

        while (true)
        {
            System.out.print("Enter an even integer (-1 to end): ");
            int num = sc.nextInt();

            if (num == -1)
            {
                break;
            }

            if (num < 2 || num > 100 || num % 2 != 0)
            {
                System.out.println("Please enter a valid even integer between 2 and 100.");
                continue;
            }

            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nCounts of even integers entered:");
        for (Map.Entry<Integer, Integer> map : frequency.entrySet())
        {
            System.out.println(map.getKey() + ": " + map.getValue() + " occurrence");
        }
    }
}