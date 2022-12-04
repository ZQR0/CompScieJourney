package org.cs.Algorithms.Sorting;

public interface SortingAlgorithm {

    /*
    * @author ZQR0
    * @params T[] array
    *
    * @since 04.12.2022
    * */
    <T extends Comparable<T>> T[] sort(T[] array);
}
