package org.cs.Leetcode;

/*
 * @author ZQR0
 * @since 8.01.2023
 * Single Number leetcode solution
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }

        return sum;
    }
}
