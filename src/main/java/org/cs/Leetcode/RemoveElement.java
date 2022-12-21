package org.cs.Leetcode;

/*
* @author ZQR0
* @since 21.12.2022
* Solution for Remove Element task from leetcode
* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
* The relative order of the elements may be changed.
*/
public class RemoveElement {
    /*
    * @method removeElement
    * @param int[] nums - input array
    * @param int val - value to check for
    * @return k - nums of array after removing val symbols
    */
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];

                k++;
            }
        }

        return k;
    }
}
