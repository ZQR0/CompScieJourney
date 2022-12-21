package org.cs.Leetcode;

/*
* @author ZQR0
* @since 21.12.2022
* Solution for integer reversing task from leetcode
*/
public class ReverseInteger {
    /*
    * @method reverse
    * @param int x - input integer
    * @return int result - reversed integer
    */
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            result = result * 10 + pop;
        }

        return result;
    }
}
