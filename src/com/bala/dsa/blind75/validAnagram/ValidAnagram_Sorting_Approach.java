package com.bala.dsa.blind75.validAnagram;

import java.util.Arrays;

public class ValidAnagram_Sorting_Approach {
    public static void main(String[] args) {
        ValidAnagram_Sorting_Approach vasa = new ValidAnagram_Sorting_Approach();
        String s = "racecar";
        String t = "carrace";
        boolean result = vasa.isAnagram(s, t);
        System.out.println(result);
    }
    public boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }
}

//Time Complexity -- O(n log n + m log m)
//Space Complexity -- O(1) or O(n+m)