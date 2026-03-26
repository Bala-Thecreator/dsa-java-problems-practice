package com.bala.dsa.blind75.containsDuplicates;

import java.util.Arrays;

public class ContainsDuplicates_HashSet_Length_Approach {
    public static void main(String[] args) {
        ContainsDuplicates_HashSet_Length_Approach cdhla = new ContainsDuplicates_HashSet_Length_Approach();
        int[] nums = {1,2,3,4,1};
        boolean result =cdhla.hasDuplicate(nums);
        System.out.println(result);
    }
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}

//Time Complexity -- O(n)
//Space Complexity -- O(n)