package com.bala.dsa.blind75.arraysHashing.longestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence_HashMap_Approach {
    public static void main(String[] args) {
        LongestConsecutiveSequence_HashMap_Approach longestConsecutiveSequence_hashMap_approach = new LongestConsecutiveSequence_HashMap_Approach();
        int[] nums = {2,20,4,10,3,4,5};

        int result = longestConsecutiveSequence_hashMap_approach.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
                mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
                mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
                res = Math.max(res, mp.get(num));
            }
        }
        return res;
    }
}

// Time Complexity -- O(n)
// Space Complexity -- O(n)