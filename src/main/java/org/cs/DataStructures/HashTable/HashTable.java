package org.cs.DataStructures.HashTable;

import java.util.ArrayList;
import java.util.Objects;

/*
* @author ZQR0
* @since 14.12.2022
* Implementation of HashTable (key - value pair) using HashNode\
* Loaded factor for this table is 0.8
* @param K key - key of pair
* @param V value - value by key
*/
public class HashTable<K, V> {

    /*
    * Array of all hash nodes
    */
    ArrayList<HashNode<K, V>> _buckets;

    /*
    * Size of hash table
    */
    private int _size;

    /*
    * Current capacity of array list
    */
    private int _numBuckets;

    /*
    * Constructor
    */
    public HashTable() {
        _buckets = new ArrayList<>();
        _numBuckets = 10;
        _size = 0;

        for (int i = 0; i < _numBuckets; i++) {
            _buckets.add(null);
        }
    }

    /*
    * @method checks is hash table empty
    * @return boolean true or false
    */
    public boolean isEmpty() {
        return _buckets.size() == 0;
    }

    /*
    * @method to get current size of hash table
    * @return int
    */
    public int size() {
        return _size;
    }

    /*
    * @method for getting a hash code of input K key
    * @return int hashcode
    */
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    /*
    * @method for getting index of key in _buckets
    * @return int index
    */
    public int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % _numBuckets;

        index = index < 0 ? index * -1 : index;
        return index;
    }

    /*
    * @method for removing a pair by key
    * @return value of removed pair
    */
    public V remove(K key) {
        int index = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = _buckets.get(index);
        HashNode<K, V> prev = null;

        while (head != null) {
            if (head._key.equals(key) && hashCode == head.hashCode()) {
                break;
            }

            prev = head;
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        _size--;

        if (prev != null) {
            prev.next = head.next;
        } else {
            _buckets.set(index, head.next);
        }

        return head._value;
    }

    /*
    * @method for adding a key and value to the table
    */
    public void add(K key, V value) {
        int index = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = _buckets.get(index);

        while (head != null) {
            if (head._key.equals(key) && head.hashCode() == hashCode) {
                head._value = value;
            }
            head = head.next;
        }

        _size++;

        head = _buckets.get(index);
        HashNode<K, V> node = new HashNode<>(key, value, hashCode);
        node.next = head;
        _buckets.set(index, node);

        if ((1.0 * _size) / _numBuckets >= 8) {
            ArrayList<HashNode<K, V>> temp = _buckets;
            _numBuckets = 2 * _numBuckets;
            _size = 0;

            for (int i = 0; i < _numBuckets; i++) {
                _buckets.add(null);
            }

            for (HashNode<K, V> newHead : temp) {
                while (newHead != null) {
                    add(newHead._key, newHead._value);
                    newHead = newHead.next;
                }
            }
        }

    }

    /*
    * @method for getting a value by key
    * @return V value
    */
    public V get(K key) {
        int index = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = _buckets.get(index);

        while (head != null) {
            if (head._key.equals(key) && hashCode == head.hashCode()) {
                return head._value;
            }

            head = head.next;
        }

        return null;
    }
}
