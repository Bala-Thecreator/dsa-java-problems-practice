package com.bala.dsa.blind75.twoPointers.validPalindrome;

public class ValidPalindrome_TwoPointer_Approach {

    public static void main(String[] args) {
        ValidPalindrome_TwoPointer_Approach validPalindrome_twoPointer_approach = new ValidPalindrome_TwoPointer_Approach();
        String str = "Was it a car or a cat I saw?";

        boolean result = validPalindrome_twoPointer_approach.isPalindrome(str);

        System.out.println("Is Palindrome: " + result);
    }
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return ((c < 'A' || c > 'Z') &&
                (c < 'a' || c > 'z') &&
                (c < '0' || c > '9'));
    }
}

// Time Complexity -- O(n)
// Space Complexity -- O(1)