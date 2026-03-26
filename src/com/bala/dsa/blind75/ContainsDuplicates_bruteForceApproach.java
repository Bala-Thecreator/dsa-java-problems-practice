package com.bala.dsa.blind75;

public class ContainsDuplicates_bruteForceApproach {
    public static void main(String[] args) {
        //hasDuplicate is non-static method. so we must create object first
        ContainsDuplicates_bruteForceApproach cd = new ContainsDuplicates_bruteForceApproach();
        int[] nums = {1,2,3,4,1};
        boolean result =cd.hasDuplicate(nums);
        System.out.println(result);
    }
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

//Time-Complexity--O(n2)
//Space-Complexity--O(1)
