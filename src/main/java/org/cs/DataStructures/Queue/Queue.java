package org.cs.DataStructures.Queue;

/*
* @author ZQR0
* @since 18.12.2022
*/
public class Queue implements Queueable {

    private int rear; // rear points to the last element in the queue
    private int[] queue; // array to store queue elements
    private int capacity; // max capacity of queue
    private int count; // count of elements in the queue
    private int front; // first elem in queue

    /*
    * Constructor
    * @param int size - size of queue
    */
    public Queue(int size) {
        queue = new int[size];
        capacity = size;
        rear = -1;
        count = 0;
        front = 0;
    }

    /*
     * @method for adding an element in queue
     */
    @Override
    public void enqueue(int elem) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            queue[rear] = elem;
            count++;
        }
    }

    /*
     * @method for removing a first element from queue
     * @return (int) first element from queue
     */
    @Override
    public int dequeue() {
        if (!isEmpty()) {
            int elem = queue[front];

            front = (front + 1) % capacity;
            count--;

            return elem;
        }

        return -1;
    }

    /*
     * @method for getting a first element in queue, but don't remove him
     * @return (int) first element in queue
     */
    @Override
    public int peek() {
        if (!isEmpty()) {
            return queue[front];
        }

        return -1;
    }

    /*
     * @method for getting a size of queue
     * @return (int) size of queue
     */
    @Override
    public int size() {
        return count;
    }

    /*
     * @method for getting is queue full
     * @return (boolean) true or false
     * Equivalent method to isEmpty()
     */
    @Override
    public boolean isFull() {
        return size() == capacity;
    }
}
