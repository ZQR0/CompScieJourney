package org.cs.Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
* @author ZQR0
* @since 8.01.2023
* Contains duplicate || leetcode solution
*/
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i ) <= k) return true;

                map.put(nums[i], i);
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
