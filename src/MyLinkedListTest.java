public class MyLinkedListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();

        // test add() and size()
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("List size: " + list.size()); // should print 3

        // test get() and indexOf()
        System.out.println("Element at index 1: " + list.get(1)); // should print "banana"
        System.out.println("Index of 'cherry': " + list.indexOf("cherry")); // should print 2

        // test add(item, index)
        list.add("orange", 1);
        System.out.println("Element at index 1 after adding 'orange': " + list.get(1)); // should print "orange"

        // test remove(item) and remove(index)
        list.remove("banana");
        System.out.println("List size after removing 'banana': " + list.size()); // should print 3
        list.remove(0);
        System.out.println("Element at index 0 after removing first element: " + list.get(0)); // should print "orange"

        // test clear()
        list.clear();
        System.out.println("List size after clearing: " + list.size()); // should print 0
    }
}
