package by.incubator.task13.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList <T> implements List<T> {

    private Object[] array;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 12;
    private static final double LOAD_FACTOR = 0.75;

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        this.array = new Object[capacity];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException(String.format("Illegal Capacity: %s", capacity));
        }
        this.array = new Object[capacity];
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (!checkArraySize()) {
            changeCapacity();
        } else {
            addToArray(o, this.size);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return (T) this.array[index];
    }

    @Override
    public T set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (!checkArraySize()) {
            changeCapacity();
        } else {
            addToArray(element, index);
        }
    }

    @Override
    public T remove(int index) {
        T element = get(index);
        removeElement(index);
        return element;
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
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    private void removeElement(int index) {
        moveElementsToLeft(index);
        size--;
    }

    private void addToArray(Object o, int index) {
        moveElementsToRight(index);
        this.array[index] = o;
        size++;
    }
    private boolean checkArraySize() {
        return size < this.capacity * LOAD_FACTOR;
    }

    private void changeCapacity(){
        this.capacity = ((this.capacity * 3) / 2) + 1;
        Object[] newArray = new Object[this.capacity];
        copyElementsToArray(newArray);
        array = newArray;
    }

    private void copyElementsToArray(Object[] newArray) {
        if (this.size >= 0) System.arraycopy(this.array, 0, newArray, 0, this.size);
    }

    private void moveElementsToRight(int index) {
        for (int i = this.size - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
    }
    private void moveElementsToLeft(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
    }
}
