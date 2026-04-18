package com.bala.dsa.blind75.arraysHashing.twoSum;

public class TwoSum_BruteForce_Approach {

    public static void main(String[] args) {
        TwoSum_BruteForce_Approach tsbf = new TwoSum_BruteForce_Approach();
        int [] nums = {3,4,5,6};
        int target =7;

        int[] result = tsbf.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }

    }
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

//Time Complexity -- O(n2)
//Space Complexity -- O(1)