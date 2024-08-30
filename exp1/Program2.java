package exp1;

import java.util.Scanner;

public class Program2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a) : ");
        int a = sc.nextInt();
        System.out.print("Enter first number (b) : ");
        int b = sc.nextInt();

        if(a % b == 0)
        {
            System.out.println(a + " is a multiple of " + b);
        }
        else
        {
            System.out.println(a + " is not the multiple of " + b);
        }
//      System.out.println(a + (a % b == 0 ? " is a multiple of " : " is not the multiple of ") + b);
    }
}