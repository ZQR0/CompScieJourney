package org.cs.Leetcode;

/*
* @author ZQR0
* @since 06.12.2022
* @param int[] nums - input array
* @param int target - number of sum of two elements in nums
* */
public class TwoNums {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }
}
