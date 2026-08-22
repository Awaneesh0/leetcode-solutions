class Solution {
    public int maxProfit(int[] prices) {
        // Track the lowest price seen so far
        int minPrice = Integer.MAX_VALUE;
        // Track the maximum profit we can achieve
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            // If we find a new, cheaper day to buy, update minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Otherwise, calculate the profit if we sold today
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}