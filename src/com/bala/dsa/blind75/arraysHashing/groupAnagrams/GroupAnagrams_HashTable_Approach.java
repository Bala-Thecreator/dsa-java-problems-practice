package com.bala.dsa.blind75.arraysHashing.groupAnagrams;

import java.util.*;

public class GroupAnagrams_HashTable_Approach {
    public static void main(String[] args) {
        GroupAnagrams_HashTable_Approach gaha = new GroupAnagrams_HashTable_Approach();
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> result = gaha.groupAnagrams(strs);
        System.out.println(result);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

//Time Complexity -- O(m*n)
//Space Complexity --
// O(m) auxiliary space, excluding the returned output.
//O(m∗n) total space if the output groups are counted.