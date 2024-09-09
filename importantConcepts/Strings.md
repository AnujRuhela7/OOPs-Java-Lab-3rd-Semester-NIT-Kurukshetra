In Java, `String`, `StringBuffer`, and `StringBuilder` are classes used for handling strings, but they differ in terms of mutability, performance, and synchronization.

### 1. **String Class:**
- **Immutable:** Objects of the `String` class are immutable, meaning their values cannot be changed once they are created.
- **Usage:** Ideal for situations where the content of the string won't change frequently, such as storing constants or literals.
- **Thread Safety:** String objects are inherently thread-safe because they cannot be modified once created.

   **Example:**
   ```java
   String str = "Hello";
   str = str.concat(" World"); // This creates a new String object
   System.out.println(str); // Output: Hello World
   ```

### **String Class Methods**

The `String` class provides a wide range of methods for string manipulation. Here are some commonly used methods:

- **`char charAt(int index)`**: Returns the character at the specified index.
- **`String concat(String str)`**: Concatenates the specified string to the end of the current string.
- **`boolean contains(CharSequence s)`**: Returns `true` if the string contains the specified sequence of characters.
- **`boolean equals(Object anObject)`**: Compares this string to the specified object.
- **`boolean equalsIgnoreCase(String anotherString)`**: Compares this string to another string, ignoring case considerations.
- **`int length()`**: Returns the length of the string.
- **`String replace(char oldChar, char newChar)`**: Returns a new string resulting from replacing all occurrences of `oldChar` with `newChar`.
- **`String[] split(String regex)`**: Splits the string around matches of the given regular expression.
- **`String substring(int beginIndex)`**: Returns a new string that is a substring of this string.
- **`String substring(int beginIndex, int endIndex)`**: Returns a new string that is a substring of this string from `beginIndex` to `endIndex - 1`.
- **`String toLowerCase()`**: Converts all characters in the string to lower case.
- **`String toUpperCase()`**: Converts all characters in the string to upper case.
- **`String trim()`**: Removes leading and trailing white spaces from the string.
- **`int indexOf(String str)`**: Returns the index within this string of the first occurrence of the specified substring.
- **`int lastIndexOf(String str)`**: Returns the index within this string of the last occurrence of the specified substring.
- **`boolean startsWith(String prefix)`**: Tests if this string starts with the specified prefix.
- **`boolean endsWith(String suffix)`**: Tests if this string ends with the specified suffix.

### **String Class Example**

This program demonstrates some common methods of the `String` class, such as `concat`, `substring`, `toUpperCase`, and `replace`.

```java
public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Concatenation
        String strConcat = str.concat(" Welcome to Java.");
        System.out.println("Concatenated String: " + strConcat);

        // Substring
        String strSub = str.substring(7, 12);
        System.out.println("Substring (7, 12): " + strSub);

        // Upper Case
        String strUpper = str.toUpperCase();
        System.out.println("Upper Case: " + strUpper);

        // Replace
        String strReplace = str.replace("World", "Java");
        System.out.println("Replaced String: " + strReplace);

        // Checking if it contains a substring
        boolean containsCheck = str.contains("World");
        System.out.println("Contains 'World': " + containsCheck);
    }
}
```

### Output:
```
Concatenated String: Hello, World! Welcome to Java.
Substring (7, 12): World
Upper Case: HELLO, WORLD!
Replaced String: Hello, Java!
Contains 'World': true
```

- **StringExample:** Shows the immutability of `String` by creating new objects after each modification.

### 2. **StringBuffer Class:**
- **Mutable:** Unlike `String`, objects of `StringBuffer` can be modified after creation.
- **Thread Safety:** `StringBuffer` is synchronized, making it thread-safe. This means multiple threads can safely manipulate a `StringBuffer` object concurrently without any external synchronization.
- **Usage:** Preferable when you need to perform multiple modifications on a string in a multithreaded environment.

   **Example:**
   ```java
   StringBuffer sb = new StringBuffer("Hello");
   sb.append(" World"); // Modifies the existing StringBuffer object
   System.out.println(sb.toString()); // Output: Hello World
   ```

### **StringBuffer Class Methods**

`StringBuffer` is used to create mutable strings. Some of its important methods are:

- **`StringBuffer append(String str)`**: Appends the specified string to this character sequence.
- **`StringBuffer insert(int offset, String str)`**: Inserts the specified string into this character sequence at the specified position.
- **`StringBuffer delete(int start, int end)`**: Removes the characters in a substring of this sequence.
- **`StringBuffer deleteCharAt(int index)`**: Removes the character at the specified position in this sequence.
- **`StringBuffer replace(int start, int end, String str)`**: Replaces the characters in a substring of this sequence with characters in the specified string.
- **`String reverse()`**: Reverses the sequence of characters in the buffer.
- **`int capacity()`**: Returns the current capacity of the `StringBuffer` object.
- **`void ensureCapacity(int minimumCapacity)`**: Ensures that the capacity is at least equal to the specified minimum.
- **`char charAt(int index)`**: Returns the `char` value at the specified index.
- **`int length()`**: Returns the length (number of characters) of the character sequence.
- **`String substring(int start, int end)`**: Returns a new string that is a substring of this sequence.
- **`StringBuffer setCharAt(int index, char ch)`**: Sets the character at the specified index to `ch`.

### **StringBuffer Class Example**

This program demonstrates the use of `StringBuffer` methods, such as `append`, `insert`, `delete`, `reverse`, and `replace`.

```java
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After Append: " + sb);

        // Insert
        sb.insert(5, ",");
        System.out.println("After Insert: " + sb);

        // Delete
        sb.delete(5, 6);
        System.out.println("After Delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        // Replace
        sb.reverse(); // Reversing back to original
        sb.replace(6, 11, "Java");
        System.out.println("After Replace: " + sb);
    }
}
```

### Output:
```
After Append: Hello World
After Insert: Hello, World
After Delete: Hello World
After Reverse: dlroW olleH
After Replace: Hello Java
```
- **StringBufferExample:** Demonstrates how `StringBuffer` can be used for mutable string operations, including modifications in place.


### 3. **StringBuilder Class:**
- **Mutable:** Similar to `StringBuffer`, `StringBuilder` is mutable and allows modifications to the string it holds.
- **Not Thread Safe:** Unlike `StringBuffer`, `StringBuilder` is not synchronized, making it more efficient in single-threaded environments but requiring external synchronization in multithreaded scenarios.
- **Usage:** Recommended when you have a single-threaded scenario or when synchronization is handled externally.

   Example:
   ```java
   StringBuilder sb = new StringBuilder("Hello");
   sb.append(" World"); // Modifies the existing StringBuilder object
   System.out.println(sb.toString()); // Output: Hello World
   ```

### **StringBuilder Class Methods**

`StringBuilder` is similar to `StringBuffer`, but it is not synchronized, making it more suitable for use in a single-threaded environment. Its methods are mostly the same as those of `StringBuffer`:

- **`StringBuilder append(String str)`**: Appends the specified string to this character sequence.
- **`StringBuilder insert(int offset, String str)`**: Inserts the specified string into this character sequence at the specified position.
- **`StringBuilder delete(int start, int end)`**: Removes the characters in a substring of this sequence.
- **`StringBuilder deleteCharAt(int index)`**: Removes the character at the specified position in this sequence.
- **`StringBuilder replace(int start, int end, String str)`**: Replaces the characters in a substring of this sequence with characters in the specified string.
- **`StringBuilder reverse()`**: Reverses the sequence of characters in this string builder.
- **`int capacity()`**: Returns the current capacity of the `StringBuilder` object.
- **`void ensureCapacity(int minimumCapacity)`**: Ensures that the capacity is at least equal to the specified minimum.
- **`char charAt(int index)`**: Returns the `char` value at the specified index.
- **`int length()`**: Returns the length (number of characters) of the character sequence.
- **`String substring(int start, int end)`**: Returns a new string that is a substring of this sequence.
- **`StringBuilder setCharAt(int index, char ch)`**: Sets the character at the specified index to `ch`.

### 3. **StringBuilder Class Example**

This program demonstrates the use of `StringBuilder` methods, such as `append`, `insert`, `delete`, `reverse`, and `setCharAt`.

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Append
        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        // Insert
        sb.insert(5, "Language ");
        System.out.println("After Insert: " + sb);

        // Delete
        sb.delete(5, 14);
        System.out.println("After Delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        // Set character at a specific index
        sb.reverse(); // Reversing back to original
        sb.setCharAt(5, '-');
        System.out.println("After setCharAt: " + sb);
    }
}
```

### Output:
```
After Append: Java Programming
After Insert: Java Language Programming
After Delete: Java Programming
After Reverse: gnimmargorP avaJ
After setCharAt: Java-Programming
```

- **StringBuilderExample:** Similar to `StringBuffer`, but more efficient for single-threaded applications where synchronization is not required.


### **Performance Differences:**
- **String:** Immutable, so any modification (like concatenation) creates a new object, which can be less efficient if done repeatedly.
- **StringBuffer:** Synchronized, ensuring thread safety but potentially slower due to synchronization overhead in multithreaded environments.
- **StringBuilder:** Not synchronized, offering better performance in single-threaded scenarios but requiring synchronization management in multithreaded applications.

### Key Differences Between Methods

- The methods of `String` are primarily used to manipulate and work with immutable strings.
- The methods of `StringBuffer` and `StringBuilder` are used for mutable strings, allowing modifications such as appending, inserting, deleting, and reversing characters.
- The `StringBuffer` methods are synchronized, making them thread-safe, while `StringBuilder` methods are not synchronized, making them faster in single-threaded scenarios.

### Conclusion

- **Use `String`** when you have fixed or constant strings that won't change frequently.
- **Use `StringBuffer`** when you need to modify strings in a thread-safe environment.
- **Use `StringBuilder`** when you need to modify strings in a non-thread-safe, single-threaded environment for better performance.


 In summary, `String` is immutable and thread-safe by design, `StringBuffer` is mutable and thread-safe, while `StringBuilder` is mutable but not thread-safe. The choice depends on your specific requirements regarding mutability, performance, and thread safety.