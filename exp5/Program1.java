package exp5;

public class Program1
{
    static String str1 = "Lab5Program1";
    static String str2;

    static
    {
        str2 = "staticBlockString";
    }

    public static void printString()
    {
        System.out.println("Normal Static String : " + str1);
        System.out.println("Static Block String : " + str2);
    }

    public static void main(String[] args)
    {
        printString();
    }
}