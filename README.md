<<<<<<< HEAD
class called MyArrayList that implements the MyList interface. MyArrayList is a generic class, meaning that it can store elements of any type.

The class has three instance variables:
- data: an array of objects that stores the elements of the list
- size: an integer that keeps track of the number of elements in the list

The constructor initializes data to an array of size 10 and sets size to 0.

The class defines methods for various operations on the list:
- size(): returns the number of elements in the list
- contains(Object o): returns true if the list contains the specified object o, false otherwise
- add(T item): adds the specified item to the end of the list. If the list is full, the method calls the private grow() method to increase the capacity of the list.
- add(T item, int index): adds the specified item to the list at the specified index. If the index is out of bounds, the method throws an IndexOutOfBoundsException. If the list is full, the method calls the grow() method to increase the capacity of the list. The method shifts all elements from the specified index to the end of the list one position to the right to make room for the new element.
- remove(T item): removes the first occurrence of the specified item from the list. If the item is not found in the list, the method returns false. Otherwise, the method shifts all elements to the right of the removed element one position to the left to fill the gap.
- remove(int index): removes the element at the specified index from the list. If the index is out of bounds, the method throws an IndexOutOfBoundsException. The method returns the removed element. The method shifts all elements to the right of the removed element one position to the left to fill the gap.
- clear(): removes all elements from the list and sets the size to 0.
- get(int index): returns the element at the specified index. If the index is out of bounds, the method throws an IndexOutOfBoundsException. 
- indexOf(Object o): returns the index of the first occurrence of the specified object o in the list. If the object is not found in the list, the method returns -1.
- lastIndexOf(Object o): returns the index of the last occurrence of the specified object o in the list. If the object is not found in the list, the method returns -1.
- sort(): sorts the elements of the list in ascending order using the Arrays.sort() method.
- The private grow() method doubles the capacity of the data array and copies the existing elements into the new array using the System.arraycopy() method. 
Overall, this code provides an implementation of a dynamic array-based list data structure with various operations to manipulate the list.

MyLinkedList class 
It's a generic class that implements the MyList interface.

The class has a private inner class Node that represents the nodes in the linked list. Each node contains an element of type T, a reference to the next node, and a reference to the previous node.
The class has three instance variables: head, tail, and size. head is a reference to the first node in the linked list, tail is a reference to the last node in the linked list, and size is the number of elements in the linked list.


