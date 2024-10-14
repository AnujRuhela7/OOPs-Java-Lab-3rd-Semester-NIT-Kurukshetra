package exp6;

import java.util.*;

public class Program2
{
    public static void main(String[] args)
    {
        // ArrayList demonstration
        System.out.println("ArrayList Demo:");
        ArrayList<String> indianTeamPlayers = new ArrayList<>();
        indianTeamPlayers.add("MS Dhoni");
        indianTeamPlayers.add("Ravindra Jadeja");
        indianTeamPlayers.add("Shardul Thakur");
        indianTeamPlayers.add("Ruturaj Gaikwad");

        // Traversing using Iterator
        Iterator<String> arrayListIterator = indianTeamPlayers.iterator();
        System.out.println("ArrayList elements using Iterator:");
        while (arrayListIterator.hasNext())
        {
            System.out.println(arrayListIterator.next());
        }

        // LinkedList demonstration
        System.out.println("\nLinkedList Demo:");
        LinkedList<String> carsBrand = new LinkedList<>();
        carsBrand.add("Range Rover");
        carsBrand.add("M.G.");
        carsBrand.add("Jeep");
        carsBrand.add("Ford");

        // Traversing using ListIterator (forwards)
        ListIterator<String> linkedListIterator = carsBrand.listIterator();
        System.out.println("LinkedList elements using ListIterator (forwards):");
        while (linkedListIterator.hasNext())
        {
            System.out.println(linkedListIterator.next());
        }

        // Traversing using ListIterator (backwards)
        System.out.println("LinkedList elements using ListIterator (backwards):");
        while (linkedListIterator.hasPrevious())
        {
            System.out.println(linkedListIterator.previous());
        }

        // Set demonstration (HashSet)
        System.out.println("\nHashSet Demo:");
        Set<String> colours = new HashSet<>();
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Pink");
        colours.add("Green");

        // Traversing using Iterator
        Iterator<String> hashSetIterator = colours.iterator();
        System.out.println("HashSet elements using Iterator:");
        while (hashSetIterator.hasNext())
        {
            System.out.println(hashSetIterator.next());
        }

        // Demonstrating Collections class methods
        System.out.println("\nCollections Class Demo:");

        // Sorting the ArrayList
        Collections.sort(indianTeamPlayers);
        System.out.println("Sorted ArrayList: " + indianTeamPlayers);

        // Reversing the LinkedList
        Collections.reverse(carsBrand);
        System.out.println("Reversed LinkedList: " + carsBrand);

        // Shuffling the ArrayList
        Collections.shuffle(indianTeamPlayers);
        System.out.println("Shuffled ArrayList: " + indianTeamPlayers);

        // Finding max and min in a List
        System.out.println("Max in ArrayList: " + Collections.max(indianTeamPlayers));
        System.out.println("Min in ArrayList: " + Collections.min(indianTeamPlayers));

        // Frequency of an element
        indianTeamPlayers.add("Apple"); // Adding "Apple" to demonstrate frequency
        System.out.println("Frequency of 'Apple' in ArrayList: " + Collections.frequency(indianTeamPlayers, "Apple"));
    }
}