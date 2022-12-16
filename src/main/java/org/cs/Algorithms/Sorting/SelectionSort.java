package org.cs.Algorithms.Sorting;

import java.util.Arrays;

/*
* @author ZQR0
* @since 16.12.2022
* Selection sort algorithm implementation
*/
public class SelectionSort {
    /*
    * @method selection sort
    * @param int[] array - input array*/
    public static void selectionSort(int[] array) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            int support = i;

            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[support]) {
                    support = j;
                }
            }

            int temp = array[support];
            array[support] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 5, 2, 1, 6};

        System.out.println(Arrays.toString(array)); // Output : [ 5, 2, 3, 5, 2, 1, 6 ]

        selectionSort(array);
        System.out.println(Arrays.toString(array)); // Output : [ 1, 2, 2, 3, 5, 5, 6 ]
    }
}
