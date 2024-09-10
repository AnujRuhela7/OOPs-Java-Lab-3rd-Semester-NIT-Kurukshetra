package exp3;

public class Program1
{
    public static void main(String[] args)
    {
        MyInteger myInt = new MyInteger(4);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("Is Even: " + myInt.isEven());
        System.out.println("Is Even (static): " + MyInteger.isEven(3));
        System.out.println("Is Even (MyInteger object): " + MyInteger.isEven(myInt));
        System.out.println("Equals (int): " + myInt.equals(4));
        System.out.println("Equals (MyInteger object): " + myInt.equals(new MyInteger(4)));
    }
}

class MyInteger
{
    private int value;

    MyInteger(int value)
    {
        this.value = value;
    }

    int getValue()
    {
        return value;
    }

    boolean isEven()
    {
        return this.value % 2 == 0;
    }

    static boolean isEven(MyInteger obj)
    {
        return obj.getValue() % 2 == 0;
    }

    static boolean isEven(int val)
    {
        return val % 2 == 0;
    }

    public boolean equals(int val)
    {
        return this.value == val;
    }

    public boolean equals(MyInteger obj)
    {
        return obj.getValue() == this.value;
    }
}