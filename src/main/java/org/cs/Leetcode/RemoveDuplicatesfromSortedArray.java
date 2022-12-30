package org.cs.Leetcode;


/*
* @author ZQR0
* @since 30.12.2022
* Remove duplicates from array leetcode solution
*/
public class RemoveDuplicatesfromSortedArray {

    /*
    * @method removeDuplicates
    * @param int[] nums - input array
    * @returns length of array without duplicates
    */
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }

        return nums.length == 0 ? 0 : index + 1;
    }
}
