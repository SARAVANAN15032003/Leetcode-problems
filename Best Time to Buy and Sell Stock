class Solution {
    public int maxProfit(int[] prices) {
      int b=prices[0];
        int mp=0;
        for(int i=1;i<prices.length;i++)
        {
if(b>prices[i])
b=prices[i];
else if(prices[i]-b>mp)
mp=prices[i]-b;
        }
        return mp;
               }
}
