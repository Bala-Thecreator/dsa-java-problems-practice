package com.bala.dsa.blind75.arraysHashing.longestConsecutiveSequence;

import java.util.Arrays;

public class LongestConsecutiveSequence_Sorting_Approach {

    public static void main(String[] args) {
        LongestConsecutiveSequence_Sorting_Approach longestConsecutiveSequence_sorting_approach = new LongestConsecutiveSequence_Sorting_Approach();
        int[] nums = {2,20,4,10,3,4,5};

        int result = longestConsecutiveSequence_sorting_approach.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0, curr = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
        }
        return res;
    }
}

//Time Complexity -- O(n log n)
//Space Complexity -- O(1) or O(n) depending on the sorting algorithm.