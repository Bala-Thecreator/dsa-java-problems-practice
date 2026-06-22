package com.bala.dsa.blind75.slidingWindow.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock_TwoPointer_Approach {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock_TwoPointer_Approach bestTimeToBuyAndSellStock_twoPointer_approach = new BestTimeToBuyAndSellStock_TwoPointer_Approach();
        int[] prices = {10,1,5,6,7,1};
        int result = bestTimeToBuyAndSellStock_twoPointer_approach.maxProfit(prices);
        System.out.println("Result: " + result);
    }
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}

//Time Complexity -- O(n)
//Space Complexity  -- O(1)