package exp1;

import java.util.Scanner;

public class Program5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        int cSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxTillNow = Integer.MIN_VALUE;

        for(int i = 0; i < size; i++)
        {
            cSum += arr[i];

            if(cSum > maxSum)
            {
                maxSum = cSum;
            }

            maxTillNow = Math.max(maxTillNow, maxSum);

            if(cSum < 0)
            {
                cSum = 0;
            }
        }

        System.out.println("Maximum Sum : " +(maxSum == 0 ? maxTillNow : maxSum));
    }
}