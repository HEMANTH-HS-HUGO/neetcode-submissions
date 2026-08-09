class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, max = 0;
        int i = 0;
        for(int j=1;j<prices.length;j++){
            if(prices[j] > prices[i]){
                profit = prices[j] - prices[i];
                max = Math.max(profit,max);
            }
            else{
                i = j;
            }
        }
        return max;
    }
}
