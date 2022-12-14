package org.cs.DataStructures.HashTable;

import java.util.ArrayList;
import java.util.Objects;

/*
* @author ZQR0
* @since 14.12.2022
* Implementation of HashTable (key - value pair) using HashNode\
* Loaded factor for this table is 0.8
* @param K - key of pair
* @param V - value by key
*/
public class HashTable<K, V> {

    ArrayList<HashNode<K, V>> _buckets;

    private int _size;

    private int _numBuckets;

    public HashTable() {
        _buckets = new ArrayList<>();
        _numBuckets = 10;
        _size = 0;

        for (int i = 0; i < _numBuckets; i++) {
            _buckets.add(null);
        }
    }

    public boolean isEmpty() {
        return _buckets.size() == 0;
    }

    public int size() {
        return _size;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    public int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % _numBuckets;

        index = index < 0 ? index * -1 : index;
        return index;
    }

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

        if ((1.0 * _size) / _numBuckets >= 7) {
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
