package com.bala.dsa.blind75.slidingWindow.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock_BruteForce_Approach {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock_BruteForce_Approach bestTimeToBuyAndSellStock_bruteForce_approach = new BestTimeToBuyAndSellStock_BruteForce_Approach();
        int[] prices = {10,1,5,6,7,1};
        int result = bestTimeToBuyAndSellStock_bruteForce_approach.maxProfit(prices);
        System.out.println("Result: " + result);
    }
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                res = Math.max(res, sell - buy);
            }
        }
        return res;
    }
}


//Time Complexity -- O(n2)
//Space Complexity  -- O(1)


