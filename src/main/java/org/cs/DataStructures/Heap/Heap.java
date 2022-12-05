package org.cs.DataStructures.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Heap<E extends Comparable<E>> implements Heapable<E> {

    List<E> elements = new ArrayList<>();

    @Override
    public void addElem(E element) {
        elements.add(element);
        int elementIndex = elements.size() - 1;

        while (!isRoot(elementIndex) && !isCorrectChild(elementIndex)) {
            int parentIndex = parentIndex(elementIndex);
            swap(elementIndex, parentIndex);
            elementIndex = parentIndex;
        }
    }

    @Override
    public boolean isRoot(int index) {
        return index == 0;
    }

    @Override
    public boolean isCorrectIndex(int parentIndex, int childIndex) {
        if (!(isValidIndex(parentIndex)) || !(isValidIndex(childIndex))) {
            return true;
        }

        return elementAt(parentIndex).compareTo(elementAt(childIndex)) < 0;
    }

    @Override
    public boolean isCorrectChild(int index) {
        return isCorrectIndex(parentIndex(index), index);
    }

    @Override
    public boolean isValidIndex(int index) {
        return index < elements.size();
    }

    @Override
    public void swap(int index1, int index2) {
        E element1 = elementAt(index1);
        E element2 = elementAt(index2);

        elements.set(index1, element2);
        elements.set(index2, element1);
    }

    private E elementAt(int index) {
        return elements.get(index);
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }
}
