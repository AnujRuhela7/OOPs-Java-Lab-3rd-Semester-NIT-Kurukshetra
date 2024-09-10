package exp2;

public class Program2
{
    public static void main(String[] args)
    {
        // Create two Dog objects
        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");

        // Display their names and what they say
        spot.display();
        scruffy.display();

        // Create a new Dog reference and assign it to spot's object
        Dog anotherDog = spot;

        // Compare references using ==
        System.out.println("\nComparing references using ==:");
        System.out.println("spot == scruffy: " + (spot == scruffy));
        System.out.println("spot == anotherDog: " + (spot == anotherDog));
        System.out.println("anotherDog == scruffy: " + (anotherDog == scruffy));

        // Compare references using equals()
        System.out.println("\nComparing references using equals():");
        System.out.println("spot.equals(scruffy): " + spot.equals(scruffy));
        System.out.println("spot.equals(anotherDog): " + spot.equals(anotherDog));
        System.out.println("anotherDog.equals(scruffy): " + anotherDog.equals(scruffy));

        // After Changing the content of scruffy object
        scruffy.name = "spot";
        scruffy.says = "Ruff!";
        System.out.println("\n Content of scruffy object : ");
        System.out.println("scruffy.name = " + scruffy.name);
        System.out.println("scruffy.says = " + scruffy.says);
        System.out.println("spot == scruffy : " + (spot == scruffy));
        System.out.println("spot.equals(scruffy) : " + (spot.equals(scruffy)));

    }
}

class Dog
{
    String name;
    String says;

    // Constructor to initialize the Dog object
    public Dog(String name, String says)
    {
        this.name = name;
        this.says = says;
    }

    // Method to display the dog's name and what it says
    public void display()
    {
        System.out.println(name + " says: " + says);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dog otherDog = (Dog) obj;
        return name.equals(otherDog.name) && says.equals(otherDog.says);
    }
}

//        spot says: Ruff!
//        scruffy says: Wurf!
//
//        Comparing references using ==:
//        spot == scruffy: false
//        spot == anotherDog: true
//        anotherDog == scruffy: false
//
//        Comparing references using equals():
//        spot.equals(scruffy): false
//        spot.equals(anotherDog): true
//        anotherDog.equals(scruffy): false