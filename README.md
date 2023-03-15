# CollectionFramework
## It's all about Collection

In Java, a collection is a group of objects or elements, similar to an array, but with additional functionality and flexibility. Collections are part of the Java Collections Framework, which provides a set of interfaces and classes to represent and manipulate collections of objects.

### There are several types of collections in Java, including:

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
