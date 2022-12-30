package org.cs.Leetcode;

import java.util.HashSet;
import java.util.Set;

/*
* @author ZQR0
* @since 30.12.2022
* Contains duplicate solution from leetcode using HashSet
*/
public class ContainsDuplicate {
    /*
    * @method containsDuplicate
    * @param int[] nums - input array for checking duplicates in
    * @returns true - if duplicates in nums, false - if not
    */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() == nums.length) {
            return false;
        }

        return true;
    }
}
