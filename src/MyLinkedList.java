public class MyLinkedList<T> implements MyList<T> {

    private class Node{
        T element;
        Node next;
        Node prev;

        Node(T element) {
            this.element = element;
            this.next = null;
            this.prev = null;}
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public void add(T item) {

        }

        @Override
        public void add(T item, int index) {

        }

        @Override
        public boolean remove(T item) {
            return false;
        }

        @Override
        public T remove(int index) {
            return null;
        }

        @Override
        public void clear() {

        }

        @Override
        public T get(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public void sort() {

        }

    }
