package com.bala.dsa.blind75.arraysHashing.twoSum;

import java.util.HashMap;

public class TwoSum_HashMap_OnePass {
    public static void main(String[] args) {
        TwoSum_HashMap_OnePass tshop = new TwoSum_HashMap_OnePass();
        int [] nums = {3,4,5,6};
        int target =7;

        int[] result = tshop.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}

//Time Complexity -- O(n)
//Space Complexity -- O(n)