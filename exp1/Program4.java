package exp1;

import java.util.Scanner;

public class Program4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Array : ");
        String inputArr = sc.nextLine();

        String[] arr = inputArr.split(" ");
        int[] array = new int[arr.length-1];

        for(int i = 0; i < array.length; i++)
        {
            if(Integer.parseInt(arr[i]) == -1)
            {
                break;
            }
            else
            {
                array[i] = Integer.parseInt(arr[i]);
            }
        }

        System.out.println("Converted Array : ");
        for (int element : array)
        {
            System.out.print(element + " ");
        }

        int[] count = new int[101];
        for(int i = 0; i < array.length; i++)
        {
            count[array[i]]++;
        }

        System.out.println("Frequency of each element : ");
        {
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i] + " : " + count[array[i]]);
            }
        }
    }
}