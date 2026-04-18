package com.bala.dsa.blind75.arraysHashing.twoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_HashMap_TwoPass {
    public static void main(String[] args) {
        TwoSum_HashMap_TwoPass tshtp = new TwoSum_HashMap_TwoPass();
        int [] nums = {3,4,5,6};
        int target =7;

        int[] result = tshtp.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}

//Time Complexity -- O(n)
//Space Complexity -- O(n)