package com.Spring.took.Array;

public class MaxProfit {
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(price));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;

        int buy = prices[0];

        for (int i =0 ;i< prices.length;i++){
        if(prices[i]> buy){
            profit  = Math.max(profit, prices[i] - buy);
        }
        else{
            buy = prices[i];
        }
        }
        return profit;
    }
}
