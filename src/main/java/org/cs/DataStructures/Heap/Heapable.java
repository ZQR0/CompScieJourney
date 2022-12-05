package org.cs.DataStructures.Heap;

/*
* @author ZQR0
* @version 0.0.1
* Interface for all types of heaps
* */
public interface Heapable<E extends Comparable<E>> {
    void addElem(E element);
    default boolean isRoot(int index) { return index == 0; };
    boolean isCorrectIndex(int parentIndex, int childIndex);
    boolean isCorrectChild(int index);
    boolean isValidIndex(int index);
    void swap(int index1, int index2);
}
