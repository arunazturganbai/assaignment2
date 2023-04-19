public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println("Element at index 1: " + myList.get(1));

        myList.remove(1);
        System.out.println("Element at index 1 after removal: " + myList.get(1));

        System.out.println("Size of list: " + myList.size());

        myList.add(4, 1);
        System.out.println("Element at index 1 after adding 4: " + myList.get(1));

        myList.remove((Integer) 3);
        System.out.println("Element 3 removed, size of list now: " + myList.size());

        System.out.println("List contains 2? " + myList.contains(2));
        System.out.println("List contains 3? " + myList.contains(3));

        myList.clear();
        System.out.println("Size of list after clear: " + myList.size());

        myList.add(5);
        myList.add(6);
        System.out.println("Element at index 1 before removal: " + myList.get(1));
        myList.remove(1);
        System.out.println("Element at index 1 after removal: " + myList.get(1));
    }
}