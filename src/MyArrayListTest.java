public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();

        // Test add(E element) method
        myList.add(1);
        myList.add(2);
        myList.add(3);
        // Test get(int index) method
        System.out.println("Element at index 1: " + myList.get(1));

        // Test remove(int index) method
        myList.remove(1);
        System.out.println("Element at index 1 after removal: " + myList.get(1));

        // Test size() method
        System.out.println("Size of list: " + myList.size());

        // Test add(E element, int index) method
        myList.add(4, 1);
        System.out.println("Element at index 1 after adding 4: " + myList.get(1));

        // Test remove(Object o) method
        myList.remove((Integer) 3);
        System.out.println("Element 3 removed, size of list now: " + myList.size());

        // Test contains(Object o) method
        System.out.println("List contains 2? " + myList.contains(2));
        System.out.println("List contains 3? " + myList.contains(3));

        // Test clear() method
        myList.clear();
        System.out.println("Size of list after clear: " + myList.size());

        // Test remove(int index) method
        myList.add(5);
        myList.add(6);
        System.out.println("Element at index 1 before removal: " + myList.get(1));
        myList.remove(1);
        System.out.println("Element at index 1 after removal: " + myList.get(1));

        // Test indexOf(Object o) method
        myList.add(7);
        myList.add(8);
        System.out.println("Index of element 7: " + myList.indexOf(7));
        System.out.println("Index of element 9: " + myList.indexOf(9));

        // Test lastIndexOf(Object o) method
        myList.add(7);
        myList.add(9);
        System.out.println("Last index of element 7: " + myList.lastIndexOf(7));
        System.out.println("Last index of element 10: " + myList.lastIndexOf(10));

        // Test sort() method
        myList.add(3);
        myList.add(1);
        myList.add(2);
        System.out.println("Before sorting: " + myList);
        myList.sort();
        System.out.println("After sorting: " + myList);
    }
}