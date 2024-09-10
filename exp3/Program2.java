package exp3;

public class Program2
{
    public static void main(String[] args)
    {
        // Create an instance of Dog class and call different overloaded bark methods
        Dog dog = new Dog();
        dog.bark();               // Calls the no-argument version
        dog.bark(7);              // Calls the int version
        dog.bark("howl");         // Calls the String version

        // Create an instance of a class without a constructor
        WithoutConstructor obj1 = new WithoutConstructor();  // Verifies default constructor

        // Create instances of the class with overloaded constructors
        WithConstructors obj2 = new WithConstructors();       // Calls the first constructor
        WithConstructors obj3 = new WithConstructors(10);     // Calls the second constructor with a value
    }
}

class Dog
{
    void bark()
    {
        System.out.println("The dog is barking!");
    }

    void bark(int volume)
    {
        if (volume < 5)
        {
            System.out.println("Soft bark");
        }
        else if (volume < 10)
        {
            System.out.println("Loud bark");
        }
        else
        {
            System.out.println("Very loud bark");
        }
    }

    void bark(String sound)
    {
        if (sound.equals("woof"))
        {
            System.out.println("Dog says woof!");
        }
        else if (sound.equals("howl"))
        {
            System.out.println("Dog is howling!");
        }
        else
        {
            System.out.println("Dog is making a different sound: " + sound);
        }
    }

}

class WithoutConstructor
{

}

class WithConstructors
{
    WithConstructors()
    {
        this(0);
        System.out.println("First constructor called");
    }

    WithConstructors(int value)
    {
        System.out.println("Second constructor called with value: " + value);
    }
}