package com.bala.dsa.blind75.arraysHashing.longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_BruteForce_Approach {

    public static void main(String[] args) {
        LongestConsecutiveSequence_BruteForce_Approach longestConsecutiveSequence_bruteForce_approach = new LongestConsecutiveSequence_BruteForce_Approach();
        int[] nums = {2,20,4,10,3,4,5};

        int result = longestConsecutiveSequence_bruteForce_approach.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        for (int num : nums) {
            int streak = 0, curr = num;
            while (store.contains(curr)) {
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}

//Time Complexity -- O(n2)
//Space Complexity -- O(n)