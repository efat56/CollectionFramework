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

Insertion order: LinkedHashMap maintains the order of insertion, which means the elements are retrieved in the same order in which they were inserted. HashMap does not guarantee any order.

Performance: LinkedHashMap takes slightly more time to insert elements than HashMap, but its retrieval time is faster than HashMap as it stores the elements in the order of insertion.

Iteration: LinkedHashMap is suitable for scenarios where the iteration order needs to be preserved, such as iterating in the order of insertion. HashMap is suitable for scenarios where the iteration order is not important.

Null values and keys: Both HashMap and LinkedHashMap allow null values, but only HashMap allows null keys.

In summary, if you need to maintain the insertion order and efficient iteration, use LinkedHashMap. If you don't need to maintain the insertion order, use HashMap for better performance.
</n>

