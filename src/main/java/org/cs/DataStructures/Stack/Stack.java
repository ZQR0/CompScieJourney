package org.cs.DataStructures.Stack;

import java.util.Vector;

public class Stack<T extends Comparable<T>> extends Vector<T> implements Stackable<T> {
    private T[] _stack;
    private int _size;

    public Stack(T[] data) {
        _stack = data;
        _size = _stack.length;
    }

    public T[] getStack() {
        return _stack;
    }

    @Override
    public void push(T value) {
        _stack[0] = value;
    }

    @Override
    public boolean isEmpty() {
        return _size == 0;
    }

    @Override
    public synchronized T pop() {
        T result = peek();
        removeElem(0);

        return result;
    }

    @Override
    public synchronized T peek() {
        assert _size != 0;
        return _stack[_size - 1];
    }

    @Override
    public int size() {
        return _size;
    }

    @Override
    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

    private void removeElem(int index) {
        int j = _size - index - 1;
        if (j > 0) {
            System.arraycopy(_stack, index + 1, _stack, index, j);
        }
    }
}
