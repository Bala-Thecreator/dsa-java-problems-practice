package com.bala.dsa.blind75.twoPointers.threeSum;

import java.util.*;

public class ThreeSum_BruteForce_Approach {

    public static void main(String[] args) {
        ThreeSum_BruteForce_Approach threeSum_bruteForce_approach = new ThreeSum_BruteForce_Approach();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum_bruteForce_approach.threeSum(nums);
        System.out.println("Result: " + result);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
                        res.add(tmp);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}

//Time Complexity --> O(n3)
//Space Complexity --> O(m), plus the space used by the sorting algorithm.