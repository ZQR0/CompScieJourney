package org.cs.Algorithms.Math;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
* @author ZQR0
* @since 30.12.2022
* Factorial calculate algorithm implementation
*/

public class Factorial {

    /*
    * @method factorial
    * @param int n - the input number
    * @returns factorial of n (input number)
    */
    public static int factorial(int n) {
        if (n <= 1) {
            return n;
        }

        int fact = 1;

        while (n != 0) {
            fact = fact * n;
            n--;
        }

        return fact;
    }
}
