package com.bala.dsa.blind75.containsDuplicates;

import java.util.Arrays;

public class ContainsDuplicates_Sorting_Approach {
    public static void main(String[] args) {
        ContainsDuplicates_Sorting_Approach cdsa = new ContainsDuplicates_Sorting_Approach();
        int[] nums = {1,2,3,4,1};
        boolean result =cdsa.hasDuplicate(nums);
        System.out.println(result);
    }
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

//Time Complexity -- O(n log n)
//Space Complexity -- O(1) or O(n) depending on the sorting algorithm