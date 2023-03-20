# CollectionFramework

## It's all about Collection Framework

In Java, a collection is a group of objects or elements, similar to an array, but with additional functionality and flexibility.
Collections are part of the Java Collections Framework, which provides a set of interfaces and classes to represent and manipulate collections of objects.

### There are several types of collections in Java. 

- List - An ordered collection of elements where duplicates are allowed.

- Set - An unordered collection of unique elements.

- Queue - An ordered collection of elements designed to hold elements prior to processing.

- Map - A collection of key-value pairs, where each key is unique.

Each type of collection has its own set of methods and properties for adding, removing, and accessing elements.

#### Some common classes in the Java Collections Framework include: 

- ArrayList - A dynamic array implementation of the List interface.

- HashSet - An implementation of the Set interface that uses a hash table to store elements.

- LinkedList - A doubly-linked list implementation of the List interface.

- HashMap - An implementation of the Map interface that uses a hash table to store key-value pairs.

Using collections in Java allows for easier and more efficient manipulation of groups of objects or elements, making it an essential part of Java programming.

## Difference between Array List and Vector

***ArrayList and Vector are both classes in the Java Collection framework that provide dynamic arrays, but there are some differences between the two:***

Thread-Safety: Vector is thread-safe, meaning that it is synchronized and multiple threads can access it simultaneously without causing data inconsistency. ArrayList is not thread-safe, and if multiple threads try to modify it simultaneously, it can result in data inconsistency.

Performance: ArrayList performs better than Vector in most cases, as Vector's synchronization adds overhead and can slow down the performance.


Capacity: When a Vector is created, it has a default capacity and when the capacity is reached, it automatically increases its size by a certain amount. In contrast, when an ArrayList is created, it has a default capacity but when that capacity is exceeded, it doubles its size.

Legacy: Vector is a legacy class and is rarely used in modern Java development, while ArrayList is a newer class and is widely used.

</n> In summary, if thread safety is not a concern and performance is important, then ArrayList is a better choice. However, if thread safety is a requirement or if the application is older and requires compatibility with older versions of Java, then Vector may be a better choice.</n>



**Example Of ArrayList**

```java
import java.util.ArrayList;

public class ArrayListExample {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      
      // Add elements to the ArrayList
      list.add("apple");
      list.add("banana");
      list.add("orange");
      
      // Print the ArrayList
      System.out.println("ArrayList: " + list);
   }
}
```

**Example Of Vector**


```java
import java.util.Vector;

public class VectorExample {
   public static void main(String[] args) {
      Vector<String> vec = new Vector<String>();
      
      // Add elements to the Vector
      vec.add("dog");
      vec.add("cat");
      vec.add("bird");
      
      // Print the Vector
      System.out.println("Vector: " + vec);
   }
}
```
## Hashing in Java

</n>
Hashing in Java is a technique used to map any large amount of data to a fixed-size values. In Java, the hashcode() method is used to generate a hash value that represents an object. This hash value can be used to quickly compare objects and optimize algorithms for searching, sorting, and data retrieval. The hashCode() method is implemented in the Object class and can be overridden by other classes to provide a custom implementation that meets their needs. Hashing is commonly used in data structures like HashMaps and HashSet to store and retrieve data efficiently.
</n>

## Difference between HashMap and LinkedHashMap

</n> 
HashMap and LinkedHashMap are two implementations of the Map interface in Java that are used to store key-value pairs. However, there are some differences between them:

**Insertion order:** LinkedHashMap maintains the order of insertion, which means the elements are retrieved in the same order in which they were inserted. HashMap does not guarantee any order.

**Performance:** LinkedHashMap takes slightly more time to insert elements than HashMap, but its retrieval time is faster than HashMap as it stores the elements in the order of insertion.

**Iteration:** LinkedHashMap is suitable for scenarios where the iteration order needs to be preserved, such as iterating in the order of insertion. HashMap is suitable for scenarios where the iteration order is not important.

**Null values and keys:** Both HashMap and LinkedHashMap allow null values, but only HashMap allows null keys.

In summary, if you need to maintain the insertion order and efficient iteration, use LinkedHashMap. If you don't need to maintain the insertion order, use HashMap for better performance.

</n>
## Class class In Java -:
</n> 
In Java, the Class class is a special class that represents the metadata of a class at runtime. It provides a way to inspect and manipulate the properties of a class, such as its fields, methods, and constructors.

Here are some of the key features and methods of the Class class in Java:

**Reflection:** The Class class provides the foundation for reflection in Java. It allows you to inspect the structure and behavior of a class at runtime, even if you don't have access to the source code. For example, you can use reflection to get a list of all the methods in a class, or to invoke a method dynamically.

**Dynamic class loading:** The Class class provides a way to load and instantiate classes dynamically at runtime. This is useful in situations where you don't know the name of a class until the program is running, or if you want to load classes from a remote location.

**Type checking:** The Class class provides a way to check if an object is an instance of a particular class. This is useful when you need to write generic code that can handle objects of different types.

**Generic type information:** The Class class provides information about the generic types of a class, including its type parameters and type arguments. This information can be useful for writing generic algorithms and data structures.

Some of the important methods provided by the Class class in Java are:

**getName():** Returns the fully qualified name of the class.

**getField(String name):** Returns a Field object that represents the named field of the class.

**getMethod(String name, Class<?>... parameterTypes):** Returns a Method object that represents the named method of the class.

**newInstance():** Creates a new instance of the class.

Overall, the Class class is an important part of the Java language, providing a powerful mechanism for inspecting and manipulating the properties of classes at runtime.
</n>

## Set And Its Type in Collection Framework -:

In the Java Collection framework, a Set is a collection that contains unique elements, which means that duplicates are not allowed. The Set interface is implemented by several classes in Java, including HashSet, TreeSet, and LinkedHashSet.

**HashSet:**
</n>
It uses a hash table to store the elements.
It provides constant-time performance for adding, removing, and checking for the presence of elements.
The order of elements is not guaranteed.
</n>

```java
import java.util.HashSet;

public class HashSetExample {
   public static void main(String[] args) {
      HashSet<String> set = new HashSet<String>();
      
      // Add elements to the HashSet
      set.add("apple");
      set.add("banana");
      set.add("orange");
      set.add("apple"); // duplicate element
      
      // Print the HashSet
      System.out.println("HashSet: " + set);
   }
}

```

**TreeSet:**
</n>
It stores the elements in a sorted tree structure.
It provides log(n) time complexity for adding, removing, and checking for the presence of elements.
The elements are stored in ascending order.
</n>

```java
import java.util.TreeSet;

public class TreeSetExample {
   public static void main(String[] args) {
      TreeSet<String> set = new TreeSet<String>();
      
      // Add elements to the TreeSet
      set.add("apple");
      set.add("banana");
      set.add("orange");
      set.add("apple"); // duplicate element
      
      // Print the TreeSet
      System.out.println("TreeSet: " + set);
   }
}
```

**LinkedHashSet:**
It maintains the insertion order of elements.
It provides constant-time performance for adding, removing, and checking for the presence of elements.
It's slower than HashSet due to additional overhead of maintaining the insertion order.

```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
   public static void main(String[] args) {
      LinkedHashSet<String> set = new LinkedHashSet<String>();
      
      // Add elements to the LinkedHashSet
      set.add("apple");
      set.add("banana");
      set.add("orange");
      set.add("apple"); // duplicate element
      
      // Print the LinkedHashSet
      System.out.println("LinkedHashSet: " + set);
   }
}
```

# Map  And its types in java

In Java, a map is an interface in the java.util package that represents a collection of key-value pairs, where each key is unique. There are several classes that implement the Map interface in Java, including HashMap, TreeMap, LinkedHashMap, and ConcurrentHashMap.

Here's an example of how to use a HashMap to create a map in Java:

```java
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        // create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // add some key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // retrieve a value from the map using a key
        int age = map.get("Bob");
        System.out.println("Bob's age is " + age);

        // iterate over the key-value pairs in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int value = entry.getValue();
            System.out.println(name + " is " + value + " years old");
        }
    }
}
```

### Output

```java
Bob's age is 30
Alice is 25 years old
Bob is 30 years old
Charlie is 35 years old
```

In this example, we create a HashMap that maps String keys to Integer values. We then add three key-value pairs to the map using the put() method, retrieve the value associated with the "Bob" key using the get() method, and iterate over all the key-value pairs in the map using a for-each loop and the entrySet() method.

### In Java, there are several types of maps available in the Java Collections Framework:

### HashMap
A hash map is a map implementation that uses hash codes to index and store its entries. It provides constant-time performance for basic operations like get() and put().

### TreeMap:
 A tree map is a map implementation that uses a red-black tree to store its entries. It maintains the entries in sorted order based on their natural ordering or a comparator provided during construction.

### LinkedHashMap:
A linked hash map is a map implementation that maintains the insertion order of its entries in a doubly-linked list. It provides a predictable iteration order that is the order in which the entries were inserted.

### WeakHashMap: 
A weak hash map is a map implementation that uses weak references for its keys. If a key is not referenced by any other objects, it can be garbage-collected, and the corresponding entry in the map will be removed automatically.

### IdentityHashMap:
An identity hash map is a map implementation that uses reference equality (==) instead of object equality (equals()) to compare keys.

### EnumMap:
An enum map is a specialized map implementation designed to store enum constants as keys. It provides high performance and type safety.

Each of these map implementations has its own strengths and weaknesses, and the choice of which one to use depends on the specific requirements of your application.



