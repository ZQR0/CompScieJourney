package org.cs.Algorithms.Sorting;

/*
* @author ZQR0
* @version 0.0.1
* */
public class BubbleSort {
    /*
    * @param int[] array
    * */
    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[j]) {
                    int t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
            System.out.println(array[j]);
        }
    }

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 6, 6, 2, 34, 10, 12, 43, 22};

        BubbleSort.sort(exampleArray); // example check
    }
}
