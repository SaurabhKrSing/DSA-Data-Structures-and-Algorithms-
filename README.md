# DSA (Data Structures and Algorithms) Interview Questions & Answers

### Table of Contents

| Questions                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------- |
| [What is Data](#What-is-Data)                                                                                                               |
| [What is Structure](#What-is-Structure)                                                                                                     |
| [What is Data Structure](#What-is-Data-Structure)                                                                                           |
| [Type of Data Structure](#Type-of-Data-Structure)                                                                                           |
| [What are some applications of Data Structures](#What-are-some-applications-of-Data-Structures)                                             |
| [What is the difference between file structure and storage structure](#What-is-the-difference-between-file-structure-and-storage-structure) |
| [What is Array](#What-is-Array)                                                                                                             |
| [Why do we need an array](#Why-do-we-need-an-array)                                                                                         |
| [What is Time Complexity](#What-is-Time-Complexity)                                                                                         |
| [What is Space Complexity](#What-is-Space-Complexity)                                                                                       |
| [What is Difference Between time complexity and space complexity](#What-is-Difference-Between-time-complexity-and-space-complexity)         |
| [Time Complexities and Space Complexities Sheet and Big O Graph](#Time-Complexities-and-Space-Complexities-Sheet-and-Big-O-Graph)           |
| [What is Difference between Linear Search and Binary Search](#What-is-Difference-between-Linear-Search-and-Binary-Search)                   |
| [What is Brute Force Algorithm](#What-is-Brute-Force-Algorithm)                                                                             |
| [What is kadane Algorithm](#What-is-kadane-Algorithm)                                                                                       |
| [What is Bubble Sort](#What-is-Bubble-Sort)                                                                                                 |
| [What is Selection Sort](#What-is-Selection-Sort)                                                                                           |
| [What is Insertion Sort](#What-is-Insertion-Sort)                                                                                           |
| [What is 2D Arrays](#What-is-2D-Arrays)                                                                                                     |
| [What is Matrix](#What-is-Matrix)                                                                                                           |
| [What is Spiral Matrix](#What-is-Spiral-Matrix)                                                                                             |
| [What is Bit Manipulation](#What-is-Bit-Manipulation)                                                                                       |
| [What is Class](#What-is-Class)                                                                                                             |
| [What is Object](#What-is-Object)                                                                                                           |
| [What is Access Modifiers](#What-is-Access-Modifiers)                                                                                       |
| [What is Getter and Setter](#What-is-Getter-and-Setter)                                                                                     |
| [What is this Keyword](#What-is-this-Keyword)                                                                                               |
| [What is Encapsulation](#What-is-Encapsulation)                                                                                             |
| [What is Constructors](#What-is-Constructors)                                                                                               |
| [Type of Constructor](#Type-of-Constructor)                                                                                                 |
| [What is Shallow Copy](#What-is-Shallow-Copy)                                                                                               |
| [What is Deep Copy](#What-is-Deep-Copy)                                                                                                     |
| [What is Lazy Copy](#What-is-Lazy-Copy)                                                                                                     |
| [What is Destructors](#What-is-Destructors)                                                                                                 |
| [What is Inheritance](#What-is-Inheritance)                                                                                                 |
| [Type of Inheritance](#Type-of-Inheritance)                                                                                                 |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |
| [](#)                                                                                                                                       |

---

### What is Data

Anytthing to give information is called data. It can be a number, string or even an image.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Structure

A structure in programming refers to the way data is organized within a computer program.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Data Structure

The term "data structure" comes from the field of mathematics where it was known as "structural analysis".

A data structure is a way of organizing and storing data in a computer so that it can be accessed and worked with efficiently. It is a specialized format for organizing, processing, retrieving and storing data.

**[⬆ Back to Top](#table-of-contents)**

---

### Type of Data Structure

Data structures can be broadly classified into two main types:

1. **Linear Data Structures**: In linear data structures, data elements are arranged in a sequential manner where each element is connected to its previous and next element. Examples include:

   - Arrays
   - Linked Lists
   - Stacks
   - Queues

2. **Non-linear Data Structures**: In non-linear data structures, data elements are not arranged in a sequential manner. Instead, they are arranged in a hierarchical manner where each element can have multiple connections to other elements. Examples include:
   - Trees
   - Graphs
   - Hash Tables

**[⬆ Back to Top](#table-of-contents)**

---

### What are some applications of Data Structures

1. **Database Management Systems (DBMS)**: Data structures like B-trees and hash tables are used for indexing and efficiently storing and retrieving data in databases.

2. **Operating Systems**: Data structures such as queues, stacks, and linked lists are used for managing system resources, scheduling tasks, and maintaining process control blocks.

3. **Compiler Design**: Data structures like symbol tables, abstract syntax trees, and intermediate representations are used in compilers for parsing, semantic analysis, and code generation.

4. **Networking**: Data structures such as graphs are used in network routing algorithms, while hash tables are used in implementing network protocols and addressing schemes.

5. **Artificial Intelligence and Machine Learning**: Data structures like trees and graphs are used to represent and manipulate complex data structures in AI and ML algorithms, such as decision trees and neural networks.

6. **Graphics and Computer Games**: Data structures like trees and graphs are used for spatial partitioning and collision detection in 2D and 3D graphics rendering and game development.

7. **Web Development**: Data structures like arrays and linked lists are used for managing and manipulating data in web applications, while hash tables are used for caching and optimizing web server performance.

8. **Embedded Systems**: Data structures are used in embedded systems for efficient memory management and real-time processing of sensor data.

**[⬆ Back to Top](#table-of-contents)**

---

### What is the difference between file structure and storage structure

**File structure** refers to how data is organized within a file, including its format, encoding, and organization.

**Storage structure** refers to how data is physically stored on a storage device, such as disk blocks or memory cells.

Both are essential for efficient data storage and retrieval in computer systems.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Array

An array is a linear data structure consisting of a collection of elements stored at contiguous memory locations. Each element in an array is accessed by its index, which represents its position within the array. Arrays can store elements of the same data type and provide constant-time access to elements.

**[⬆ Back to Top](#table-of-contents)**

---

### Why do we need an array

Arrays provide a structured way to store and access multiple elements of the same data type in a contiguous memory block. They offer efficient random access, enabling easy manipulation, iteration, and processing of data, making them essential for organizing and managing collections of data in various algorithms and applications.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Time Complexity

**Time complexity** refers to the amount of time an algorithm takes to complete as a function of the length of its input. It measures how the runtime of an algorithm grows with the size of the input data. Time complexity is typically expressed using big O notation.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Space Complexity

**Space complexity** refers to the amount of memory space an algorithm requires as a function of the length of its input. It measures how the memory usage of an algorithm grows with the size of the input data. Space complexity is also typically expressed using big O notation.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Difference Between time complexity and space complexity

| Aspect       | Time Complexity                                                                                                            | Space Complexity                                                                                                                            |
| ------------ | -------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| Definition   | Represents the amount of time taken by an algorithm to run as a function of the input size.                                | Represents the amount of memory space taken by an algorithm to run as a function of the input size.                                         |
| Measure      | Typically measured in terms of the number of basic operations (e.g., comparisons, assignments) performed by the algorithm. | Typically measured in terms of the amount of memory used by the algorithm, including variables, data structures, and recursive call stacks. |
| Notation     | Usually expressed using Big O notation (e.g., O(n), O(n^2)) to denote the worst-case time complexity of an algorithm.      | Also expressed using Big O notation (e.g., O(n), O(n^2)) to denote the worst-case space complexity of an algorithm.                         |
| Importance   | Indicates how the runtime of an algorithm scales with the input size, helping to assess efficiency.                        | Indicates how much memory an algorithm consumes with respect to the input size, which is crucial for resource-constrained environments.     |
| Optimization | Focuses on reducing the number of operations performed by the algorithm to improve efficiency.                             | Focuses on minimizing the amount of memory used by the algorithm, such as optimizing data structures or reducing unnecessary allocations.   |

**[⬆ Back to Top](#table-of-contents)**

---

### Time Complexities and Space Complexities Sheet and Big O Graph

**Worst Case Time Complexity:** The absolute most number of times an operation needs to be done before completed
**Average Case Time Complexity:** The average number of times it will take for the algorithm / code to complete
**Amortized Running Time:** Similar to average, it is the number of times the operation will take when run a sufficient amount of time consecutively
**Best Case Time Complexity:** The fastest number of times an operation needs to complete

![](readmeImage/big-o-cheat-sheet-poster.png)

![](readmeImage/Common_Data_Structure_Operations.png)

![](readmeImage/sorting.png)

![](readmeImage/Sorting%20And%20Searching%20Algorithms%20-%20Time%20Complexities%20Cheat%20Sheet.png)

![](readmeImage/graph.webp)

**[⬆ Back to Top](#table-of-contents)**

---

### What is Difference between Linear Search and Binary Search

Linear search and binary search are both algorithms used to search for an element in a list or array, but they differ in their approach, efficiency, and implementation.

Here's a comparison between Linear Search and Binary Search:

| Aspect           | Linear Search                                                                                                                 | Binary Search                                                                                                                            |
| ---------------- | ----------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| Approach         | Sequentially checks each element in the list/array until the target element is found or the end of the list/array is reached. | Divides the list/array into halves and repeatedly narrows down the search range by comparing the target element with the middle element. |
| Complexity       | Time complexity: O(n) (linear)                                                                                                | Time complexity: O(log n) (logarithmic)                                                                                                  |
| Data Requirement | Works on both sorted and unsorted lists/arrays.                                                                               | Requires the list/array to be sorted beforehand.                                                                                         |
| Performance      | Suitable for small lists/arrays or unsorted data.                                                                             | Suitable for large lists/arrays or sorted data.                                                                                          |
| Implementation   | Simple to implement.                                                                                                          | Requires a sorted list/array and more complex implementation.                                                                            |
| Iterations       | May require scanning through the entire list/array in the worst case.                                                         | Halves the search space with each iteration, resulting in fewer iterations.                                                              |
| Examples         | Searching a name in a phone book.                                                                                             | Searching a word in a dictionary.                                                                                                        |

**[⬆ Back to Top](#table-of-contents)**

---

### What is Brute Force Algorithm

Brute force refers to a straightforward problem-solving approach where all possible solutions are systematically tried until the correct one is found. While conceptually simple and easy to implement, brute force algorithms may be inefficient for large problem instances due to their exponential time complexity.

**[⬆ Back to Top](#table-of-contents)**

---

### What is kadane Algorithm

Kadane's algorithm is a dynamic programming approach used to find the maximum sum of a contiguous subarray within an array of numbers. It efficiently computes the maximum subarray sum by iterating through the array once and keeping track of the maximum sum seen so far.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. It iterates through the list until no more swaps are needed, resulting in the elements "bubbling" into their correct positions.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Selection Sort

Selection Sort iteratively selects the smallest (or largest) element from the unsorted part of the array and swaps it with the first element of the unsorted part. This process continues until the entire array is sorted. It has a time complexity of O(n^2) in all cases.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Insertion Sort

Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time. It iterates over each element, comparing it with the already sorted elements and inserting it into its correct position, shifting the larger elements to the right.

**[⬆ Back to Top](#table-of-contents)**

---

### What is 2D Arrays

A 2D array is an array of arrays, forming a grid-like structure where elements are accessed using two indices, typically representing rows and columns in a tabular data format.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Matrix

A matrix is a two-dimensional array of elements arranged in rows and columns. It's commonly used to represent mathematical concepts, graphs, images, or tabular data in computer science algorithms and applications.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Spiral Matrix

A spiral matrix is a matrix (2D array) arranged in a spiral order, where elements are accessed by traversing the matrix in a spiral path starting from the top-left corner and moving towards the center in a clockwise or counterclockwise direction.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Bit Manipulation

Bit manipulation is the act of algorithmically manipulating bits or binary digits, which are the most basic form of data in computing. It involves using bitwise operators (AND, OR, XOR, NOT, shifts) to perform operations at the bit level, enabling efficient and low-level data processing and optimization.

### Common Bitwise Operators

Here are the primary bitwise operators in many programming languages:

- **AND (`&`)**: Sets each bit to 1 if both corresponding bits are 1.
- **OR (`|`)**: Sets each bit to 1 if at least one of the corresponding bits is 1.
- **XOR (`^`)**: Sets each bit to 1 if only one of the corresponding bits is 1.
- **NOT (`~`)**: Inverts all the bits.
- **Left Shift (`<<`)**: Shifts all bits to the left by a specified number of positions.
- **Right Shift (`>>`)**: Shifts all bits to the right by a specified number of positions.
- **Unsigned Right Shift (`>>>`)**: Shifts all bits to the right by a specified number of positions, filling the leftmost bits with zeros.

### Examples and Usage

#### 1. **Bitwise AND**

```javascript
let a = 5; // Binary: 0101
let b = 3; // Binary: 0011
let result = a & b; // Binary: 0001 (Decimal: 1)
```

#### 2. **Bitwise OR**

```javascript
let a = 5; // Binary: 0101
let b = 3; // Binary: 0011
let result = a | b; // Binary: 0111 (Decimal: 7)
```

#### 3. **Bitwise XOR**

```javascript
let a = 5; // Binary: 0101
let b = 3; // Binary: 0011
let result = a ^ b; // Binary: 0110 (Decimal: 6)
```

#### 4. **Bitwise NOT**

```javascript
let a = 5; // Binary: 0101
let result = ~a; // Binary: 1010 (Decimal: -6, due to two's complement representation)
```

#### 5. **Left Shift**

```javascript
let a = 5; // Binary: 0101
let result = a << 1; // Binary: 1010 (Decimal: 10)
```

#### 6. **Right Shift**

```javascript
let a = 5; // Binary: 0101
let result = a >> 1; // Binary: 0010 (Decimal: 2)
```

### Applications of Bit Manipulation

1. **Performance Optimization**: Bitwise operations are faster and require less memory than arithmetic operations.
2. **Cryptography**: Many cryptographic algorithms use bit manipulation.
3. **Data Compression**: Bit manipulation is used to pack data efficiently.
4. **Graphics**: Manipulating individual pixels or colors in images.
5. **Network Programming**: Manipulating IP addresses and subnets.
6. **Embedded Systems**: Controlling hardware at the bit level.

### Example Problem: Checking if a Number is Even or Odd

You can check if a number is even or odd using a bitwise AND operation.

```javascript
let num = 10;
let isEven = (num & 1) === 0; // True if even, false if odd
```

If the least significant bit is 0, the number is even; if it is 1, the number is odd.

Bit manipulation is a powerful tool in the arsenal of a programmer, allowing for efficient and effective data processing and control at the most fundamental level.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Class

Class is a blueprint for creating objects, defining attributes and methods common to all objects of that type.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Object

Object is an instance of a class. It contains data (attributes) and methods to manipulate that data.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Access Modifiers

Access modifiers in Java are keywords that set the accessibility of classes, methods, and other members. They control the visibility and scope, determining where these members can be accessed from.

The four main access modifiers are:

1. **Public**: The member is accessible from any other class.

   ```java
   public class MyClass {
       public int myPublicVariable;
       public void myPublicMethod() { }
   }
   ```

2. **Private**: The member is accessible only within the class it is declared in.

   ```java
   public class MyClass {
       private int myPrivateVariable;
       private void myPrivateMethod() { }
   }
   ```

3. **Protected**: The member is accessible within its own package and by subclasses (including subclasses in different packages).

   ```java
   public class MyClass {
       protected int myProtectedVariable;
       protected void myProtectedMethod() { }
   }
   ```

4. **Default (Package-Private)**: When no access modifier is specified, the member is accessible only within its own package.
   ```java
   public class MyClass {
       int myDefaultVariable;
       void myDefaultMethod() { }
   }
   ```

These modifiers are essential for encapsulation, allowing developers to restrict access to the inner workings of a class and protect the integrity of the data.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Getter and Setter

In Java, getters and setters are methods used to access and modify the private variables of a class. They are part of the encapsulation principle in object-oriented programming, allowing controlled access to the fields of a class.

### Getter

A getter method is used to retrieve the value of a private variable. It usually has the prefix `get` followed by the variable name with the first letter capitalized.

**Example:**

```java
public class Person {
    private String name;

    // Getter method
    public String getName() {
        return name;
    }
}
```

### Setter

A setter method is used to set or update the value of a private variable. It usually has the prefix `set` followed by the variable name with the first letter capitalized.

**Example:**

```java
public class Person {
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### What is this Keyword

The `this` keyword is a reference to the current object within an instance method or constructor. It is used to differentiate between instance variables and parameters with the same name, and to call other constructors in the same class.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Encapsulation

Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. It also implements data hiding.

Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield.

### Real-World Example

A real-world example is a bank account. The balance (data) is private and can only be accessed or modified through methods (deposit and withdraw), ensuring controlled and secure transactions.

### Code Example

```java
public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### What is Constructors

Constructors are special methods with the same name as the class, automatically invoked during object creation to initialize its state. They don't have return types and are called only once per object.

There are some points to clarify:

1. **Constructor Invocation**: Constructors are indeed special methods invoked automatically at the time of object creation. They initialize the newly created object.

2. **Name**: Constructors have the same name as the class or structure they belong to. This is accurate.

3. **Return Type**: Constructors do not have a return type, not even `void`. This is true; they simply initialize the object and do not return anything.

4. **Invocation Frequency**: Constructors are indeed only called once, at the time of object creation. Each time a new instance of the class is created, its constructor is invoked.

5. **Memory Allocation**: Memory allocation for the object happens when the constructor is called.

**[⬆ Back to Top](#table-of-contents)**

---

### Type of Constructor

Certainly! Here are examples of each type of constructor:

1. **Non-parameterized Constructor**: Initializes object without any parameters.

```java
public class MyClass {
    int number;

    // Non-parameterized constructor
    public MyClass() {
        number = 0; // Default initialization
    }
}
```

2. **Parameterized Constructor**: Accepts parameters to initialize object fields.

```java
public class Employee {
    String name;
    int age;

    // Parameterized constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

3. **Copy Constructor**: Creates a new object by copying values from another object.

```java
public class Point {
    int x, y;

    // Copy constructor
    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### What is Shallow Copy

**Shallow Copy :** Copies the object and references to the same instances of other objects. Changes to shared objects affect both the original and the copied object.

### Shallow Copy Example

Consider a simple `Book` class that has a reference to an `Author` class.

#### Code

```java
class Author {
    String name;

    Author(String name) {
        this.name = name;
    }
}

class Book implements Cloneable {
    String title;
    Author author;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("Jane Austen");
        Book originalBook = new Book("Pride and Prejudice", author);
        Book copiedBook = (Book) originalBook.clone();

        System.out.println("Original author: " + originalBook.author.name); // Output: Jane Austen
        System.out.println("Copied author: " + copiedBook.author.name); // Output: Jane Austen

        copiedBook.author.name = "Charles Dickens";

        System.out.println("Original author after change: " + originalBook.author.name); // Output: Charles Dickens
        System.out.println("Copied author after change: " + copiedBook.author.name); // Output: Charles Dickens
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### What is Deep Copy

**Deep Copy :** Copies the object and also creates copies of any objects it references. Changes to copied objects do not affect the original objects.

### Deep Copy Example

Let's example to perform a deep copy.

#### Code

```java
class Author implements Cloneable {
    String name;

    Author(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy of Author, but it's sufficient for deep copying Book
    }
}

class Book implements Cloneable {
    String title;
    Author author;

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clonedBook = (Book) super.clone(); // Shallow copy of Book
        clonedBook.author = (Author) author.clone(); // Deep copy of Author
        return clonedBook;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("Jane Austen");
        Book originalBook = new Book("Pride and Prejudice", author);
        Book copiedBook = (Book) originalBook.clone();

        System.out.println("Original author: " + originalBook.author.name); // Output: Jane Austen
        System.out.println("Copied author: " + copiedBook.author.name); // Output: Jane Austen

        copiedBook.author.name = "Charles Dickens";

        System.out.println("Original author after change: " + originalBook.author.name); // Output: Jane Austen
        System.out.println("Copied author after change: " + copiedBook.author.name); // Output: Charles Dickens
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### What is Lazy Copy

Lazy copy, also known as "lazy cloning" or "copy-on-write," is a technique that combines aspects of both shallow and deep copying to optimize performance and memory usage. The idea is to delay the actual copying of objects until it is absolutely necessary, typically when a modification is made to the copied object.

### How Lazy Copy Works

1. **Initial Copy (Shallow)**:
   - When an object is initially copied, a shallow copy is performed. Both the original and the copied object share references to the same instances of any referenced objects.
2. **On Write (Deep)**:
   - When a modification is made to the copied object, a deep copy of the referenced objects is performed at that moment. This ensures that changes to the copied object do not affect the original object.

#### Code

```java
class Text {
    String content;

    Text(String content) {
        this.content = content;
    }
}

class Document {
    String title;
    Text text;
    boolean isCopied = false;

    Document(String title, Text text) {
        this.title = title;
        this.text = text;
    }

    public Document lazyCopy() {
        // Perform a shallow copy
        Document copy = new Document(this.title, this.text);
        copy.isCopied = true;
        return copy;
    }

    public void modifyText(String newContent) {
        if (isCopied) {
            // Perform a deep copy on modification
            this.text = new Text(newContent);
            isCopied = false;
        } else {
            this.text.content = newContent;
        }
    }

    public static void main(String[] args) {
        Text text = new Text("Hello, World!");
        Document originalDoc = new Document("Original", text);
        Document copiedDoc = originalDoc.lazyCopy();

        System.out.println("Original text: " + originalDoc.text.content); // Output: Hello, World!
        System.out.println("Copied text: " + copiedDoc.text.content); // Output: Hello, World!

        copiedDoc.modifyText("Hello, Lazy Copy!");

        System.out.println("Original text after modification: " + originalDoc.text.content); // Output: Hello, World!
        System.out.println("Copied text after modification: " + copiedDoc.text.content); // Output: Hello, Lazy Copy!
    }
}
```

### Explanation

1. **Initial Copy**:
   - The `lazyCopy` method performs a shallow copy. Both `originalDoc` and `copiedDoc` share the same `Text` object.
2. **Modification**:
   - When `modifyText` is called on `copiedDoc`, it checks if the document was copied (`isCopied` is `true`). Since it was, it performs a deep copy of the `Text` object by creating a new `Text` instance with the new content. This ensures that `originalDoc` and `copiedDoc` no longer share the same `Text` object.

### Benefits of Lazy Copy

- **Performance**: By delaying the deep copy until it is necessary, lazy copy can save computational resources and improve performance when many copies are made without modification.

- **Memory Efficiency**: It reduces the memory overhead by avoiding unnecessary deep copies when the objects are not modified.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Destructors

In Java, destructors are not explicitly defined as in C++. Java uses garbage collection to automatically manage memory, cleaning up unreferenced objects without the need for explicit destructors.

**[⬆ Back to Top](#table-of-contents)**

---

### What is Inheritance

Inheritance is when properties and methods of base class are passed on to a derived class.

Inheritance allows a class to inherit properties and methods from another class. This promotes code reuse and establishes a hierarchical relationship between classes.

### Real-World Example

Consider a real-world example of a basic animal classification:

- **Animal**: A general class representing animals.
- **Dog**: A specific class representing dogs that inherits from the Animal class.

### Java Code Example

```java
// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Specific method
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### Type of Inheritance

In object-oriented programming, there are several types of inheritance. Here are the main ones:

1. **Single Inheritance**: A class inherits from one superclass.
2. **Multiple Inheritance**: A class inherits from more than one superclass. (Note: Java does not support multiple inheritance directly; it uses interfaces to achieve similar functionality.)
3. **Multilevel Inheritance**: A class inherits from a superclass, which in turn inherits from another superclass.
4. **Hierarchical Inheritance**: Multiple classes inherit from a single superclass.
5. **Hybrid Inheritance**: A combination of two or more types of inheritance. Java supports hybrid inheritance through interfaces.

### Examples in Java

#### Single Inheritance

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```

#### Multilevel Inheritance

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("The puppy plays.");
    }
}
```

#### Hierarchical Inheritance

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
```

#### Hybrid Inheritance (using interfaces)

```java
interface CanFly {
    void fly();
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Bird extends Animal implements CanFly {
    public void fly() {
        System.out.println("The bird flies.");
    }
}
```

**[⬆ Back to Top](#table-of-contents)**

---

### WHat is Polymorphism

Polymorphism allows objects to be treated as instances of their parent class or interface, enabling a single interface to represent different underlying data types. This promotes flexibility and code reuse.

### Real-World Car Example:

Consider a scenario with different types of cars:

- **Vehicle**: The superclass representing all vehicles.
- **Car**: A subclass representing cars.
- **SUV**: Another subclass representing SUVs.

### Java Code Example:

```java
class Vehicle {
    void drive() {
        System.out.println("This vehicle is being driven.");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("The car is being driven.");
    }
}

class SUV extends Vehicle {
    @Override
    void drive() {
        System.out.println("The SUV is being driven.");
    }
}

public class Main {
    static void testDrive(Vehicle vehicle) {
        vehicle.drive();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle suv = new SUV();

        testDrive(car);
        testDrive(suv);
    }
}
```

### Explanation:

- **Vehicle Class**: Defines a common behavior (`drive` method) for all vehicles.
- **Car Class**: Overrides the `drive` method to specify car-specific behavior.
- **SUV Class**: Overrides the `drive` method to specify SUV-specific behavior.
- **Main Class**: Demonstrates polymorphism by passing both `Car` and `SUV` objects to the `testDrive` method. Despite being treated as `Vehicle` objects, their respective `drive` methods are invoked based on their actual types.

In this example, polymorphism allows both cars and SUVs to be driven using a common method `testDrive`, simplifying code and promoting flexibility.

**[⬆ Back to Top](#table-of-contents)**

---

### Types of Polymorphism

1. **Compile-Time Polymorphism (Static Binding or Method Overloading)**
2. **Run-Time Polymorphism (Dynamic Binding or Method Overriding)**

### Compile-Time Polymorphism (Method Overloading)

Method Overloading occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both).

#### Example

```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(2, 3));        // Output: 5
        System.out.println(math.add(2.5, 3.5));    // Output: 6.0
        System.out.println(math.add(1, 2, 3));     // Output: 6
    }
}
```

### Run-Time Polymorphism (Method Overriding)

Method Overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method in the subclass overrides the method in the superclass.

#### Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();  // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.sound();  // Output: Cat meows
    }
}
```

### Key Points

- **Compile-Time Polymorphism**: Resolved during compile time. Uses method overloading.
- **Run-Time Polymorphism**: Resolved during runtime. Uses method overriding.
- **Advantages**: Promotes flexibility and reusability, enabling the same method to perform different tasks based on the object it is acting upon.

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---

###

**[⬆ Back to Top](#table-of-contents)**

---
