package com.bala.dsa.blind75.arraysHashing.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf_BruteForce_Approach {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf_BruteForce_Approach productOfArrayExceptSelf_bruteForce_approach = new ProductOfArrayExceptSelf_BruteForce_Approach();
        int [] nums = {1,2,4,6};

        int[] result = productOfArrayExceptSelf_bruteForce_approach.productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            res[i] = prod;
        }
        return res;
    }
}
// Time Complexity -- O(n2)
//Space Complexity -- O(1) extra space and O(n) space for the output array