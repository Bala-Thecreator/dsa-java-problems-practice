package com.bala.dsa.blind75.twoPointers.validPalindrome;

public class ValidPalindrome_Reverse_String_Approach {
    public static void main(String[] args) {
        ValidPalindrome_Reverse_String_Approach validPalindrome_reverse_string_approach = new ValidPalindrome_Reverse_String_Approach();

        String str = "Was it a car or a cat I saw?";

        boolean result = validPalindrome_reverse_string_approach.isPalindrome(str);

        System.out.println("Is Palindrome: " + result);

    }

    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().contentEquals(newStr.reverse());
    }
}

// Time Complexity -- O(n)
// Space Complexity -- O(n)
