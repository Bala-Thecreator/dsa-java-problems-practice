package com.bala.dsa.blind75.twoPointers.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_TwoPointer_Approach {
    public static void main(String[] args) {
        ThreeSum_TwoPointer_Approach threeSum_twoPointer_approach = new ThreeSum_TwoPointer_Approach();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum_twoPointer_approach.threeSum(nums);
        System.out.println("Result: " + result);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}

//Time Complexity --> O(n2)
//Space Complexity --> O(1)