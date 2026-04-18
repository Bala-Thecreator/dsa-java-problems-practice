package com.bala.dsa.blind75.arraysHashing.twoSum;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSum_Sorting_Approach {
    public static void main(String[] args) {
        TwoSum_Sorting_Approach tssa = new TwoSum_Sorting_Approach();
        int [] nums = {3,4,5,6};
        int target =7;

        int[] result = tssa.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found.");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[][] A = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i];
            A[i][1] = i;
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int cur = A[i][0] + A[j][0];
            if (cur == target) {
                return new int[]{Math.min(A[i][1], A[j][1]),
                        Math.max(A[i][1], A[j][1])};
            } else if (cur < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}

//Time Complexity -- O(n log n)
//Space Complexity -- O(n)