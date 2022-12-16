package org.cs.Algorithms.Sorting;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length != 0 || !(low >= high)) {

            int mid = low + (high - low) / 2;
            int support = array[mid];

            int i  = low;
            int j = high;

            while (i <= j) {
                while (array[i] < support) {
                    i++;
                }

                while (array[i] > support) {
                    j--;
                }

                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            if (low < j) {
                quickSort(array, low, j);
            }

            if (high > i) {
                quickSort(array, i, high);
            }
        }
    }
}
