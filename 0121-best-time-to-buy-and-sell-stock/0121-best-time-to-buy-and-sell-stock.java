class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            else{
                int currentprofit = prices[i] - buy;
                if(currentprofit > profit){
                    profit = currentprofit;
                }
            }
        }
        return profit;
    }
}