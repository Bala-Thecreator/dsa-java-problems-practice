package com.bala.dsa.blind75.containsDuplicates;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates_HashSet_Approach {
    public static void main(String[] args) {
        ContainsDuplicates_HashSet_Approach cdha =  new ContainsDuplicates_HashSet_Approach();
        int[] nums = {1,2,3,4,1};
        boolean result =cdha.hasDuplicate(nums);
        System.out.println(result);
    }
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

//Time Complexity -- O(n)
//Space Complexity -- O(n)
