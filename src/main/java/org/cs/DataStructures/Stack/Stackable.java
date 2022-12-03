package org.cs.DataStructures.Stack;

/*
* @version 0.0.1
* @author ZQR0
* Stackable is interface to create stack classes with any types
* */
public interface Stackable<T> {
    void push(T value);    // Method for adding element into the stack
    boolean isEmpty();    // Method for checking is stack empty or not
    T pop();              // Removes the object at the top of this stack and returns that object as the value of this function.
    T peek();             // Looks at the object at the top of this stack without removing it from the stack.
    int size();           // Returns size of stack
    int search(Object o); // Search any elem in stack
}
