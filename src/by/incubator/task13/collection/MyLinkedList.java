package by.incubator.task13.collection;

import javax.xml.soap.Node;
import java.util.*;

public class MyLinkedList <T> implements List<T> {

    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
        this.first = new Node(null, null, null);
        this.last = new Node(null, this.first, null);
        this.first.next = this.last;
    }

    private static class Node<T> {
        private Node next;
        private Node prev;
        private T value;

        public Node(Node next, Node prev, T value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.first.next == this.last;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        addBefore(last, t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        Node node = getNode(index);
        return (T) node.value;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        Node node = getNode(index);
        addBefore(node, element);
    }

    @Override
    public T remove(int index) {
        Node node = getNode(index);
        removeElement(node);
        return (T) node.value;
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
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


    private void removeElement(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    private Node getNode(int index) {
        Node node = this.first.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void addBefore(Node findNode, T value) {
        Node lastNode = findNode.prev;
        Node newNode = new Node(findNode, lastNode, value);
        lastNode.next = newNode;
        findNode.prev = newNode;
        size++;
    }
}
