package Top_Interview_Questions.Arrays_Easy;

class BuySellStocks {
    /**
     * Problem: Say you have an array prices for which the ith element is the price of a given stock on day i.
     * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., 
     * buy one and sell one share of the stock multiple times).
     * 
     * @param prices array of prices for i-th days
     * @return max profit which can be gained by trading all profitable stocks
     */
    static public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            // every time a stock price is higher than the previous day, we want to trade
            if (prices[i] > prices[i-1]) profit += prices[i] - prices[i-1];
        }
        return profit;
    }
}