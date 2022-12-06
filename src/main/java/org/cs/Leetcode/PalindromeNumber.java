package org.cs.Leetcode;

/*
* @author ZQR0
* @since 06.12.2022
* @param n - input number to check is it palindrome
* */
public class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        if (n < 0 || (n % 10 == 0 & n !=0)) {
            return false;
        }

        int revertedNumber = 0;
        while (revertedNumber < n) {
            revertedNumber = revertedNumber * 10 + n % 10;
            n /= 10;
        }

        return n == revertedNumber || n == revertedNumber / 10;
    }

    public static void main(String[] args) {
        final int x = 555;
        final int y = 123;
        final int z = 787;

        System.out.println(isPalindrome(x)); // true
        System.out.println(isPalindrome(y)); // false
        System.out.println(isPalindrome(z)); // true
    }
}
