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
