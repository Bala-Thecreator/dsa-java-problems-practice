package com.bala.dsa.blind75.arraysHashing.topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements_Sorting_Approach {

    public static void main(String[] args) {

        TopKFrequentElements_Sorting_Approach tkfesa =
                new TopKFrequentElements_Sorting_Approach();

        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;

        int[] result = tkfesa.topKFrequent(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}

//Time Complexity -- O(n log n)
//Space Complexity -- O(n)