package com.bala.dsa.blind75.arraysHashing.topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements_BucketSort_Approach {

    public static void main(String[] args) {
        TopKFrequentElements_BucketSort_Approach tkfeba = new TopKFrequentElements_BucketSort_Approach();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;

        int[] result = tkfeba.topKFrequent(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }

    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}

//Time Complexity -- O(n)
//Space Complexity -- O(n)
