The provided program demonstrates key concepts in Java related to object creation, reference comparison, and the difference between comparing object references using `==` and comparing objects using the `equals()` method.

### Program Explanation

#### 1. **Class Definition:**

The program defines a class called `Dog` with the following attributes:

- **Fields:**
    - `String name`: Represents the name of the dog.
    - `String says`: Represents what the dog says (like "Ruff!" or "Wurf!").

- **Constructor:**
    - `public Dog(String name, String says)`: Initializes a new `Dog` object with the specified `name` and `says` values.

- **Method:**
    - `public void display()`: Prints the `name` and `says` attributes of the `Dog` object.

#### 2. **Main Method in `Program2` Class:**

The `main()` method in the `Program2` class contains the following steps:

- **Creating Two Dog Objects:**

  ```java
  Dog spot = new Dog("spot", "Ruff!");
  Dog scruffy = new Dog("scruffy", "Wurf!");
  ```
    - Two `Dog` objects, `spot` and `scruffy`, are created with different names and sayings:
        - `spot`: Name is "spot", and says "Ruff!".
        - `scruffy`: Name is "scruffy", and says "Wurf!".

- **Displaying Dog Information:**

  ```java
  spot.display();
  scruffy.display();
  ```
    - Calls the `display()` method to print the name and what each dog says:
        - Output:
          ```
          spot says: Ruff!
          scruffy says: Wurf!
          ```

- **Creating a New Reference and Assigning It to `spot`'s Object:**

  ```java
  Dog anotherDog = spot;
  ```
    - A new reference `anotherDog` is created and assigned to refer to the same object as `spot`. This means both `anotherDog` and `spot` now point to the **same object** in memory.

#### 3. **Reference Comparison Using `==`:**

- The `==` operator is used to compare the object references:

  ```java
  System.out.println("spot == scruffy: " + (spot == scruffy));
  System.out.println("spot == anotherDog: " + (spot == anotherDog));
  System.out.println("anotherDog == scruffy: " + (anotherDog == scruffy));
  ```

  **Explanation:**

    - **`spot == scruffy`:**
        - This comparison checks if the references `spot` and `scruffy` point to the same object in memory.
        - Since `spot` and `scruffy` are two different objects created with `new`, they point to different memory locations.
        - **Output:** `false`.

    - **`spot == anotherDog`:**
        - This checks if `spot` and `anotherDog` point to the same object.
        - `anotherDog` is assigned to `spot`, so they reference the **same object**.
        - **Output:** `true`.

    - **`anotherDog == scruffy`:**
        - This checks if `anotherDog` and `scruffy` point to the same object.
        - They reference different objects, so the comparison returns `false`.
        - **Output:** `false`.

  **Output:**
  ```
  Comparing references using ==:
  spot == scruffy: false
  spot == anotherDog: true
  anotherDog == scruffy: false
  ```

#### 4. **Comparison Using `equals()` Method:**

- The `equals()` method is used to compare the contents of the objects:

  ```java
  System.out.println("spot.equals(scruffy): " + spot.equals(scruffy));
  System.out.println("spot.equals(anotherDog): " + spot.equals(anotherDog));
  System.out.println("anotherDog.equals(scruffy): " + anotherDog.equals(scruffy));
  ```

  **Explanation:**

    - **`spot.equals(scruffy)`:**
        - The `equals()` method in the `Object` class is used here (since it hasn't been overridden in the `Dog` class).
        - By default, `equals()` performs the same check as `==`, comparing object references.
        - Since `spot` and `scruffy` are different objects, this returns `false`.
        - **Output:** `false`.

    - **`spot.equals(anotherDog)`:**
        - Since `anotherDog` is assigned to `spot`, both references point to the **same object**.
        - Thus, `spot.equals(anotherDog)` returns `true`.
        - **Output:** `true`.

    - **`anotherDog.equals(scruffy)`:**
        - Since `anotherDog` and `scruffy` refer to different objects, `equals()` returns `false`.
        - **Output:** `false`.

  **Output:**
  ```
  Comparing references using equals():
  spot.equals(scruffy): false
  spot.equals(anotherDog): true
  anotherDog.equals(scruffy): false
  ```

#### 5. **Changing the Content of `scruffy` Object:**

- The contents of the `scruffy` object are modified to match those of the `spot` object:

  ```java
  scruffy.name = "spot";
  scruffy.says = "Ruff!";
  ```

- After these assignments, `scruffy` now has:
    - `name = "spot"`
    - `says = "Ruff!"`

#### 6. **Comparing Objects After Content Change:**

- **Display Modified Content:**

  ```java
  System.out.println("\n Content of scruffy object : ");
  System.out.println("scruffy.name = " + scruffy.name);
  System.out.println("scruffy.says = " + scruffy.says);
  ```

- **Comparison After Modification:**

  ```java
  System.out.println("spot == scruffy : " + (spot == scruffy));
  System.out.println("spot.equals(scruffy) : " + (spot.equals(scruffy)));
  ```

  **Explanation:**

    - **`spot == scruffy`:**
        - This still returns `false` because the `==` operator checks reference equality, and `spot` and `scruffy` still point to **different objects** in memory, even though their content is now the same.

    - **`spot.equals(scruffy)`:**
        - This also returns `false` because the `equals()` method in `Object` checks reference equality by default. Since it hasn't been overridden in the `Dog` class, it behaves like `==`, returning `false` because `spot` and `scruffy` are different objects.

  **Output:**
  ```
  Content of scruffy object : 
  scruffy.name = spot
  scruffy.says = Ruff!
  spot == scruffy : false
  spot.equals(scruffy) : false
  ```

### Key Takeaways:

1. **`==` Operator:**
    - Compares whether two references point to the same object in memory.
    - Returns `true` if they point to the same memory location, `false` otherwise.

2. **`equals()` Method:**
    - By default (if not overridden), behaves like `==` and compares object references.
    - For custom content-based comparison, the `equals()` method should be overridden in the class.

3. **Object Content vs. Reference:**
    - Even if two objects have identical content, `==` will return `false` if they are not the same object.
    - By default, `equals()` will also return `false` unless overridden to compare the contents rather than references.

To summarize, this program illustrates the difference between object reference comparison (`==`) and the default `equals()` method behavior in Java, showing that both check whether two references point to the same object, not whether two objects contain the same data.