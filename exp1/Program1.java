package exp1;

import java.util.Scanner;

public class Program1
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number between 0 to 1000 : ");

      int number = sc.nextInt();

      System.out.println(method1(number));
      System.out.println(method2(number));

      // String num = number + "";
      // int product = 1;
      // for (int i = 0; i < num.length(); i++) {
      // product *= Integer.parseInt(num.charAt(i) + "");
      // }
      // System.out.println("Digit Wise Product = " + product);
    }

    public static int method1(int n)
    {
        String num = n + "";
        int product = 1;
        for (int i = 0; i < num.length(); i++)
        {
            product *= Integer.parseInt(num.charAt(i) + "");
        }
        return product;
    }

    public static int method2(int n)
    {
        int product = 1;
        int copy = n;
        while(copy > 0)
        {
            int digit = copy % 10;
            product *= digit;
            copy = copy / 10;
        }
        return product;
    }
}