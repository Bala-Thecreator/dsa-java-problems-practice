package com.bala.dsa.blind75.twoPointers.containerWithMostWater;

public class ContainerWithMostWater_BruteForce_Approach {
    public static void main(String[] args) {
        ContainerWithMostWater_BruteForce_Approach containerWithMostWater_bruteForce_approach = new ContainerWithMostWater_BruteForce_Approach();
        int[] nums = {1,7,2,5,4,7,3,6};
        int result = containerWithMostWater_bruteForce_approach.maxArea(nums);
        System.out.println("Result: " + result);
    }
    public int maxArea(int[] heights) {
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                res = Math.max(res, Math.min(heights[i], heights[j]) * (j - i));
            }
        }
        return res;
    }
}

//Time Complexity --> O(n2)
//Space Complexity --> O(1)