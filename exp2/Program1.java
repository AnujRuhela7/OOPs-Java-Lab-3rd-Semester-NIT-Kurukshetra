package exp2;

public class Program1
{
    public static void compareStrings(String str1, String str2)
    {
        System.out.println("Comparing \"" + str1 + "\" and \"" + str2 + "\":");

        boolean isEqualByReference = (str1 == str2);
        boolean isEqualByEquals = (str1.equals(str2));
        System.out.println("== comparison: " + isEqualByReference + " (equals() check: " + isEqualByEquals + ")");

        boolean isNotEqualByReference = (str1 != str2);
        boolean isNotEqualByEquals = (!str1.equals(str2));
        System.out.println("!= comparison: " + isNotEqualByReference + " (equals() check: " + isNotEqualByEquals + ")");

        int compareToResult = str1.compareTo(str2);
        System.out.println("compareTo() result: " + compareToResult);

        boolean isEqualByEqualsMethod = str1.equals(str2);
        System.out.println("equals() method: " + isEqualByEqualsMethod);

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("equalsIgnoreCase() result: " + isEqualIgnoreCase);

        boolean startsWith = str1.startsWith(str2);
        boolean endsWith = str1.endsWith(str2);
        System.out.println("startsWith() result: " + startsWith);
        System.out.println("endsWith() result: " + endsWith);

        boolean contains = str1.contains(str2);
        System.out.println("contains() result: " + contains);

        int length1 = str1.length();
        int length2 = str2.length();
        System.out.println("Length of str1: " + length1);
        System.out.println("Length of str2: " + length2);

        System.out.println();
    }

    public static void main(String[] args)
    {
        compareStrings("Hello", "Hello");
        compareStrings("Hello", "hello");
        compareStrings("Hello", new String("Hello"));
        compareStrings("Java", "Python");
    }
}