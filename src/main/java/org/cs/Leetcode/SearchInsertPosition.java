package org.cs.Leetcode;

/*
* @author ZQR0
* @since 2.01.2023
* Search Insert Position leetcode solution
*/
public class SearchInsertPosition {
    /*
    * @method searchInsert
    * @params int[] nums - input int array, target - int target for getting an index of this number in array
    * @returns index of target position
    */
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] < target) {
                return i;
            }
        }

        return nums.length;
    }
}
