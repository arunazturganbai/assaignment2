public class MyArrayList<T> implements MyList<T> {

    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[10]; // initial capacity of 10
        this.size = 0;
    }

    public int size() {
        return size;
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
