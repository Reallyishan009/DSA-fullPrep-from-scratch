## Instance vs Object in Java

In Java (and object-oriented programming in general), the terms **instance** and **object** are closely related and commonly used, but they have subtle distinctions:

### Object

- An **object** is a concrete entity created based on a class.
- It is a runtime entity that has state (fields/attributes) and behavior (methods).
- **Example:**

Solution sol = new Solution();

Here, `sol` is an object of the `Solution` class.

### Instance

- An **instance** is the actual occurrence of any object.
- When you create an object from a class, you have created an instance of that class.
- The phrase "instance of a class" is commonly used to describe any object made from that class.
- **Example:**
- In the code above, you can say "`sol` is an instance of the `Solution` class."

### Summary Table

| Term     | Meaning                                                            | Example in Java                                 |
|----------|--------------------------------------------------------------------|-------------------------------------------------|
| Object   | The actual entity created from a class (occupies memory)           | `Solution sol = new Solution(); // sol is an object` |
| Instance | The realization of a class as an object (an object is an instance) | "sol is an instance of Solution"                |

**In short:**  
Every time you create an object with `new`, you are creating a new instance of that class.  
So, **every object is an instance, and every instance is an object.**



# Why does printing an array in Java show something like `[I@15db9742`?

When you try to print an array directly in Java using:


what gets printed is **not the contents of the array**, but rather the **object reference string** (something like `[I@15db9742`). This happens because:

- Arrays in Java do **not override** the `toString()` method from the base `Object` class.
- The default `toString()` implementation prints the class name (`[I` for int arrays) and the object's hashcode in hexadecimal (e.g. `@15db9742`).

---

## How to properly print array contents?

To print the elements of an array in a human-readable way, use:

import java.util.Arrays;
System.out.println(Arrays.toString(array));