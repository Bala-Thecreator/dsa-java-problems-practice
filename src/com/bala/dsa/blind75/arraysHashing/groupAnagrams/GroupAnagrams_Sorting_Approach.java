package com.bala.dsa.blind75.arraysHashing.groupAnagrams;

import java.util.*;

public class GroupAnagrams_Sorting_Approach {
    public static void main(String[] args) {
        GroupAnagrams_Sorting_Approach gasa = new GroupAnagrams_Sorting_Approach();
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> result = gasa.groupAnagrams(strs);
        System.out.println(result);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

//Time Complexity -- O(m*n log n)
//Space Complexity -- O(m * n)

//Note:Key Interview Concept
//Different anagrams produce the SAME sorted string.
//That sorted string becomes the grouping key.