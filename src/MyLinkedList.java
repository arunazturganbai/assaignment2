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
            return indexOf(o) != -1;
        }

        @Override
        public void add(T item) {
            Node newNode = new Node(item);
            if (head == null) {
                head = newNode;
                tail = newNode;}
            else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;}
            size++;
        }

        @Override
        public void add(T item, int index){
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }
            if (index == size) {
                add(item);
                return;}
            Node newNode = new Node(item);
            if (index == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            else {
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;}

        @Override
        public boolean remove(T item) {
            Node current = head;
            while (current != null) {
                if (current.element.equals(item)) {
                    if (current == head) {
                        head = current.next;
                    }
                    else {
                        current.prev.next = current.next;
                    }
                    if (current == tail){
                        tail = current.prev;
                    }
                    else{
                        current.next.prev = current.prev;
                    }
                    size--;
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        @Override
        public T remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current == head) {
                head = current.next;
            }
            else {
                current.prev.next = current.next;
            }
            if(current == tail) {
                tail = current.prev;
            }
            else {
                current.next.prev = current.prev;
            }
            size--;
            return current.element;
        }

        @Override
        public void clear() {
            head = null;
            tail = null;
            size = 0;
        }

    @Override
        public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.element;
    }

        @Override
        public int indexOf(Object o){
            Node current = head;
            for (int i = 0; i < size; i++) {}
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

