class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int buy = prices[0];
        int currentprofit = 0;
        int maxprofit = 0;
        for(int i = 0; i< prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            if(prices[i] > buy){
                currentprofit = prices[i] - buy;
            }
            if(currentprofit > maxprofit){
                maxprofit = currentprofit;
            }
        }
        return maxprofit;
    }
}