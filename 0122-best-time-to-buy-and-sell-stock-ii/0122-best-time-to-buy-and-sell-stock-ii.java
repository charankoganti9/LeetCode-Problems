class Solution {
    public int maxProfit(int[] prices) {
            int i = 0;
        int maxProfit = 0;
        int valley = prices[0];
        int peak = prices[0];
        
        while (i < prices.length - 1) {
            // Move the index to the valley/local minimum
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            
            // Move the index to the peak/local maximum
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            
            // Add the difference between peak and valley
            maxProfit += peak - valley;
        }
        
        // maxProfit now contains the total profit from valley to peak differences
        return maxProfit;
    }
}