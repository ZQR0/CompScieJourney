package org.cs.Leetcode;

/*
* @author ZQR0
* @since 24.12.2022
* Plus One leetcode task solution
*/
public class PlusOne {
    /*
    * @method plusOne
    * @param int[] digits - input array
    * @return int[] result - new array with elements + 1
    */
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
        result[0] = 1;

        return result;
    }
}
