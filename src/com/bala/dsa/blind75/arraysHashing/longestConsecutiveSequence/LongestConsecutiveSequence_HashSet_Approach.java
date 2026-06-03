package com.bala.dsa.blind75.arraysHashing.longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_HashSet_Approach {
    public static void main(String[] args) {
        LongestConsecutiveSequence_HashSet_Approach longestConsecutiveSequence_hashSet_approach = new LongestConsecutiveSequence_HashSet_Approach();
        int[] nums = {2,20,4,10,3,4,5};

        int result = longestConsecutiveSequence_hashSet_approach.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

// Time Complexity -- O(n)
// Space Complexity -- O(n)