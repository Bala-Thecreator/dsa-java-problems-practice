package com.bala.dsa.blind75.twoPointers.containerWithMostWater;

public class ContainerWithMostWater_TwoPointer_Approach {
    public static void main(String[] args) {
        ContainerWithMostWater_TwoPointer_Approach containerWithMostWater_twoPointer_approach = new ContainerWithMostWater_TwoPointer_Approach();
        int[] nums = {1,7,2,5,4,7,3,6};
        int result = containerWithMostWater_twoPointer_approach.maxArea(nums);
        System.out.println("Result: " + result);
    }
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int res = 0;

        while (l < r) {
            int area = Math.min(heights[l], heights[r]) * (r - l);
            res = Math.max(res, area);
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}

//Time Complexity -- O(n)
//Space Complexity  -- O(1)