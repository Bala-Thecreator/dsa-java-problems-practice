package com.bala.dsa.blind75.arraysHashing.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf_PrefixAndSuffix_Approach_Optimal {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf_PrefixAndSuffix_Approach_Optimal productOfArrayExceptSelf_prefixAndSuffix_approach_optimal = new ProductOfArrayExceptSelf_PrefixAndSuffix_Approach_Optimal();
        int [] nums = {1,2,4,6};

        int[] result = productOfArrayExceptSelf_prefixAndSuffix_approach_optimal.productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}

//Time Complexity -- O(n)
//Space Complexity --O(1) extra space and O(n) space for the output array
