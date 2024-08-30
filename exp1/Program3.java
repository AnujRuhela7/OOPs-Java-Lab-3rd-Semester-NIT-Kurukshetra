package exp1;

import java.util.Scanner;

public class Program3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Array Elements : ");
        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        moveZerosToEnd(array);
    }

    public static void moveZerosToEnd(int[] arr)
    {
        int idx = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[idx++] = arr[i];
            }
        }

        while(idx < arr.length)
        {
            arr[idx++] = 0;
        }

        System.out.print("Modified Array : ");
        for (int element : arr)
        {
            System.out.print(element + " ");
        }
    }
}