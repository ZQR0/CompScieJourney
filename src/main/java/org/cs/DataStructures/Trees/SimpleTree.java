package org.cs.DataStructures.Trees;

import java.util.ArrayList;
import java.util.List;

public class SimpleTree<E> {
    List<E> elements = new ArrayList<>();

    public void add(E elem) {
        elements.add(elem);
    }

    public E elementAt(int index) {
        return elements.get(index);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int parentIndex(int index) {
        return (index - 1) / 2;
    }

    public int leftChildIndex(int index) {
        return (index * 2) + 1;
    }

    public int rightChildIndex(int index) {
        return (index * 2) + 2;
    }
}
