package org.cs.Algorithms.Sorting;

/*
* @author ZQR0
* @since 03.01.2023
* Heap sort algorithm implementations
*/
public class HeapSort {

    /*
    * @method sort - the main sorting method
    * @param int[] array - input array
    */
    public static void sort(int[] array) {
        final int n = array.length;

        for (int i = n / 2; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    /*
    * @method heapify - method for converting array to heap object (like tree)
    * @params int[] arr - input array, int n - start index, int i - the largest element
    */
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (i < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    /*
    * @method getArray - method for getting an output array
    * @params int[] array - (sorted) array
    * @returns elements from this array by for-bach cycle
    */
    public static int getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            return array[i];
        }

        return 0;
    }
}
