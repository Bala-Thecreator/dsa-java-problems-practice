package com.bala.dsa.blind75.twoPointers.threeSum;

import java.util.*;

public class ThreeSum_HashMap_Approach {
    public static void main(String[] args) {
        ThreeSum_HashMap_Approach threeSum_hashMap_approach = new ThreeSum_HashMap_Approach();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum_hashMap_approach.threeSum(nums);
        System.out.println("Result: " + result);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.get(nums[i]) - 1);
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                count.put(nums[j], count.get(nums[j]) - 1);
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int target = -(nums[i] + nums[j]);
                if (count.getOrDefault(target, 0) > 0) {
                    res.add(Arrays.asList(nums[i], nums[j], target));
                }
            }

            for (int j = i + 1; j < nums.length; j++) {
                count.put(nums[j], count.get(nums[j]) + 1);
            }
        }
        return res;
    }

}

//Time Complexity --> O(n2)
//Space Complexity --> O(n)