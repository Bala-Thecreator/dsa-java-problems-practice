package com.bala.dsa.blind75.arraysHashing.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf_PrefixAndSuffix_Approach {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf_PrefixAndSuffix_Approach productOfArrayExceptSelf_prefixAndSuffix_approach = new ProductOfArrayExceptSelf_PrefixAndSuffix_Approach();
        int [] nums = {1,2,4,6};

        int[] result = productOfArrayExceptSelf_prefixAndSuffix_approach.productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }
        return res;
    }
}

//Time Complexity -- O(n)
//Space Complexity --O(n)