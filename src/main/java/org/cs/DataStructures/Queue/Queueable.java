package org.cs.DataStructures.Queue;

/*
* @author ZQR0
* @since 18.12.2022
* Interface for implementation Queue class
*/
public interface Queueable {

    /*
    * @method for adding an element in queue
    */
    void enqueue(int elem);

    /*
     * @method for removing a first element from queue
     * @return (int) first element from queue
     */
    int dequeue();

    /*
    * @method for getting a first element in queue, but don't remove him
    * @return (int) first element in queue
    */
    int peek();

    /*
    * @method for getting a size of queue
    * @return (int) size of queue
    */
    int size();

    /*
    * @method for getting is queue empty
    * @return (boolean) true of false
    */
    default boolean isEmpty() {
        return size() == 0;
    };

    /*
    * @method for getting is queue full
    * @return (boolean) true or false
    * Equivalent method to isEmpty()
    */
    boolean isFull();

}
