package org.cs.DataStructures.HashTable;

/*
* @author ZQR0
* @since 14.12.2022
* Class for implement a node for hash table (key - value pair)
*/

public class HashNode<K, V> {
    K _key;
    V _value;
    private final int _hashCode;

    public HashNode(K key, V value, int hashCode) {
        this._key = key;
        this._value = value;
        this._hashCode = hashCode;
    }
}
