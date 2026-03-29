package com.bala.dsa.blind75.validAnagram;

public class ValidAnagram_HashTable_Approach {
    public static void main(String[] args) {
        ValidAnagram_HashTable_Approach vahta = new ValidAnagram_HashTable_Approach();
        String s = "racecar";
        String t = "carrace";
        boolean result = vahta.isAnagram(s, t);
        System.out.println(result);
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}

//Time Complexity -- O(n+m)
//Space Complexity -- O(1)
