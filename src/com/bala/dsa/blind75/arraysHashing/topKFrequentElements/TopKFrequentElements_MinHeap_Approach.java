package com.bala.dsa.blind75.arraysHashing.topKFrequentElements;

import java.util.*;

public class TopKFrequentElements_MinHeap_Approach {

    public static void main(String[] args) {
        TopKFrequentElements_MinHeap_Approach tkfemha = new TopKFrequentElements_MinHeap_Approach();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;

        int[] result = tkfemha.topKFrequent(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = Objects.requireNonNull(heap.poll())[1];
        }
        return res;
    }
}

//Time Complexity -- O(nlogk)
//Space Complexity -- O(n+k)