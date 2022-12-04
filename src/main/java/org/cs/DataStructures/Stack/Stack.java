package org.cs.DataStructures.Stack;

import java.util.Vector;

/*
* @author ZQR0
* @version 0.0.1
* */
public class Stack<T extends Comparable<T>> extends Vector<T> implements Stackable<T> {
    /*
    * stack field
    * */
    private T[] _stack;
    /*
    * size of stack (length)
    * */
    private int _size;

    public Stack(T[] data) {
        _stack = data;
        _size = _stack.length;
    }

    /*
    * @returns null
    * adds new elem to stack
    * @params T value
    * */
    @Override
    public void push(T value) {
        _stack[0] = value;
    }

    /*
    * @returns boolean value
    * */
    @Override
    public boolean isEmpty() {
        return _size == 0;
    }

    /*
    * @returns removed object from top of the stack
    * */
    @Override
    public synchronized T pop() {
        T result = peek();
        removeElem(0);

        return result;
    }

    /*
    * @returns object from top of the stack
    * */
    @Override
    public synchronized T peek() {
        assert _size != 0;
        return _stack[_size - 1];
    }

    /*
    * @returns size of stack (length)
    * */
    @Override
    public int size() {
        return _size;
    }

    /*
    * @returns index of param object
    * @params Object o
    * */
    @Override
    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

    /*
    * private method to remove elem by index
    * */
    private void removeElem(int index) {
        int j = _size - index - 1;
        if (j > 0) {
            System.arraycopy(_stack, index + 1, _stack, index, j);
        }
    }
}
