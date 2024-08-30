package exp2;

public class Program3
{

    public static void main(String[] args) {
        // Creating a StringBuilder object with an initial string
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append(): Adds text at the end of the current sequence
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert(): Inserts text at a specified index
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);

        // 3. replace(): Replaces a portion of the sequence with another string
        sb.replace(6, 15, "Wonderful");
        System.out.println("After replace: " + sb);

        // 4. delete(): Removes a portion of the sequence
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt(): Removes a single character at a specified index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 6. reverse(): Reverses the entire sequence
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. setCharAt(): Changes a character at a specified index
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // 8. capacity(): Returns the current capacity of the StringBuilder
        System.out.println("Capacity: " + sb.capacity());

        // 9. ensureCapacity(): Ensures that the capacity is at least equal to the specified minimum
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 10. length(): Returns the number of characters in the StringBuilder
        System.out.println("Length: " + sb.length());

        // 11. substring(): Extracts a portion of the sequence as a String (similar to String class)
        String sub = sb.substring(0, 5);
        System.out.println("Substring (0, 5): " + sub);

        // 12. toString(): Converts the StringBuilder object to a String
        String finalString = sb.toString();
        System.out.println("Final string: " + finalString);
    }
}