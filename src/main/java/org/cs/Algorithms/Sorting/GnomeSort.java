package org.cs.Algorithms.Sorting;


/*
* @author ZQR0
* @since 03.01.2023
* Gnome sort algorithm implementation
*/
public class GnomeSort {
    /*
    * @method sort - main sorting method
    * @param int[] array - input array
    */
    public static void sort(int[] array) {

        int i = 1; // second index for array
        int j = 2; //third index for array

        while (i < array.length) {
            if (array[i-1] <= array[i]) {
                i = j;
                j++;
            }

            int temp = array[i-1];
            array[i-1] = array[i];
            array[--i] = temp;

            i = (i==0) ? j++ : i;
        }

    }
}
