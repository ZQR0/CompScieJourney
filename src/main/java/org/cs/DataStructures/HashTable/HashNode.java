package org.cs.DataStructures.HashTable;

/*
* @author ZQR0
* @since 14.12.2022
* Class for implement a node for hash table (key - value pair)
*/

public class HashNode<K, V> {
    /*
    * @param K _key - key of pair
    */
    K _key;
    /*
    * @param V _value - value for key
    */
    V _value;
    /*
    * @param int _hashCode - just a hash code of params
    */
    private final int _hashCode;

    /*
    * @param HashNode<K, V> next - param for getting a next node of table
    */
    public HashNode<K, V> next;

    /*
    * Constructor
    */
    public HashNode(K key, V value, int hashCode) {
        this._key = key;
        this._value = value;
        this._hashCode = hashCode;
    }
}
