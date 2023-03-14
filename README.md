# CollectionFramework
## It's all about collection

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

ArrayList and Vector are both classes in the Java Collection framework that provide dynamic arrays, but there are some differences between the two: Thread-Safety: Vector is thread-safe, meaning that it is synchronized and multiple threads can access it simultaneously without causing data inconsistency. ArrayList is not thread-safe, and if multiple threads try to modify it simultaneously, it can result in data inconsistency.

Performance: ArrayList performs better than Vector in most cases, as Vector's synchronization adds overhead and can slow down the performance.
